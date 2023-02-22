package com.demo.service;

import com.demo.dto.Travel;
import com.demo.mapper.TravelMapper;
import com.demo.model.entity.TravelEntity;
import com.demo.model.repository.TravelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelService {

    @Autowired
    private TravelRepository travelRepository;


    public List<Travel> getTravels()
    {
       List<TravelEntity> travelEntities =  travelRepository.findAll();
       return TravelMapper.fromEntities(travelEntities);
    }
}
