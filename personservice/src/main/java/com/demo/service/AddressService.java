package com.demo.service;

import com.demo.model.entity.AddressEntity;
import com.demo.model.entity.PersonEntity;
import com.demo.model.repository.AddressRepository;
import com.demo.model.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;

@Service
@AllArgsConstructor
public class AddressService {

    private final AddressRepository addressRepository;
    private final PersonRepository personRepository;


    @Transactional
    public void save(String location, Long personId)
    {
        PersonEntity entity =  personRepository.findById(personId)
                .orElseThrow(() ->
                        new EntityNotFoundException(" Address not exist with Id "+personId));

        AddressEntity addressEntity =   AddressEntity.builder()
                .location(location)
                .personEntity(entity)
                .build();

        addressRepository.save(addressEntity);

    }

    public void update(Long addressId, String location)
    {
        AddressEntity entity =  addressRepository.findById(addressId)
                 .orElseThrow(() ->
            new EntityNotFoundException(" Address not exist with Id "+addressId));

        entity.setLocation(location);

        addressRepository.save(entity);
    }

    public void delete(Long id)
    {
        addressRepository.deleteById(id);
    }

}
