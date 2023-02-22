package com.demo.mapper;

import com.demo.dto.Address;
import com.demo.dto.Person;
import com.demo.model.entity.AddressEntity;
import com.demo.model.entity.PersonEntity;

import java.util.ArrayList;
import java.util.List;

public interface PersonMapper {

     static Person fromEntity(PersonEntity entity)
    {
        List<Address> addresses = new ArrayList<>();
        if(entity.getAddressEntities() != null)
        {
            entity.getAddressEntities().stream().forEach(addressEntity ->
                    addresses.add(AddressMapper.fromEntity(addressEntity))
            );
        }

        return Person.builder()
                .personId(entity.getId())
                .personName(entity.getName())
                .addresses(addresses)
                .build();
    }



}
