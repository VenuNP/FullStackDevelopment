package com.demo.controller;

import com.demo.dto.Address;
import com.demo.dto.Person;
import com.demo.service.AddressService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/addresses")
@AllArgsConstructor
public class AddressController {

    private final AddressService addressService;



    @PostMapping
    public void save(@RequestBody Address address)
    {
         addressService.save(address.getLocation(),address.getPersonId());
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") Long addressId,@RequestBody Address address)
    {
         addressService.update(addressId, address.getLocation());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long addressId)
    {
        addressService.delete(addressId);
    }
}
