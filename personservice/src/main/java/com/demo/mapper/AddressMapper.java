package com.demo.mapper;

import com.demo.dto.Address;
import com.demo.dto.Person;
import com.demo.model.entity.AddressEntity;
import com.demo.model.entity.PersonEntity;

public interface AddressMapper {

     static Address fromEntity(AddressEntity entity)
    {
        return Address.builder()
                .addressId(entity.getId())
                .location(entity.getLocation())
                .personId(entity.getPersonId())
                .build();
    }


}
