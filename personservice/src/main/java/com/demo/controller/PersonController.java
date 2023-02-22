package com.demo.controller;

import com.demo.dto.Person;
import com.demo.service.PersonService;
import lombok.AllArgsConstructor;
import org.hibernate.dialect.MySQL8Dialect;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persons")
@AllArgsConstructor
public class PersonController {

    private final PersonService personService;

    @GetMapping
    public List<Person> getAll()
    {
        return personService.getAll();
    }

    @GetMapping("/{id}")
    public Person getById(@PathVariable("id") Long personId)
    {
        return personService.getById(personId);
    }


    @PostMapping
    public Person save(@RequestBody Person person)
    {
        return personService.save(person.getPersonName());
    }

    @PutMapping("/{id}")
    public Person update(@PathVariable("id") Long personId,@RequestBody Person person)
    {
        return personService.update(personId, person.getPersonName());
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long personId)
    {
         personService.delete(personId);
    }
}
