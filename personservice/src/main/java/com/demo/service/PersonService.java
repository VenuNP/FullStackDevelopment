package com.demo.service;

import com.demo.dto.Person;
import com.demo.mapper.PersonMapper;
import com.demo.model.entity.PersonEntity;
import com.demo.model.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;

    public Person save(String name)
    {
        PersonEntity entity =  PersonEntity.builder()
                .name(name)
                .build();

        PersonEntity personEntity =   personRepository.save(entity);
        return PersonMapper.fromEntity(personEntity);
    }

    public Person update(Long id, String name)
    {
        PersonEntity entity =  personRepository.findById(id) .orElseThrow(() ->
                new EntityNotFoundException(" Person not exist with Id "+id));

        entity.setName(name);
        personRepository.save(entity);
        return PersonMapper.fromEntity(entity);

    }

    public void delete(Long id)
    {
        personRepository.deleteById(id);
    }

    public Person getById(Long id)
    {
        PersonEntity entity =  personRepository.findById(id).orElse(null);
        if(entity == null)
        {
            return null;
        }

            return PersonMapper.fromEntity(entity);

    }

    public List<Person> getAll()
    {
        List<PersonEntity>  entities =  personRepository.findAll();
        List<Person> persons = new ArrayList<>();
        entities.stream().forEach(entity ->
                        persons.add( PersonMapper.fromEntity(entity))
                );

        return persons;

    }
}
