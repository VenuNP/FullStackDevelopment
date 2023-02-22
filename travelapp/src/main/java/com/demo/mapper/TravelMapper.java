package com.demo.mapper;

import com.demo.dto.Travel;
import com.demo.model.entity.BusEntity;
import com.demo.model.entity.CityEntity;
import com.demo.model.entity.TravelEntity;
import org.apache.tomcat.jni.Address;

import java.util.ArrayList;
import java.util.List;

public interface TravelMapper {

     static Travel fromEntity(TravelEntity travelEntity)
    {
        BusEntity busEntity = travelEntity.getBusEntity();
        CityEntity sourceCity = travelEntity.getSourceCity();
        CityEntity destinationCity = travelEntity.getDestinationCity();


        return Travel.builder()
                .busId(busEntity.getId())
                .busType(busEntity.getType())
                .startingPoint(sourceCity.getName())
                .endingPoint(destinationCity.getName())
                .startTime(travelEntity.getStartTime())
                .endTime(travelEntity.getEndTime())
                .fair(travelEntity.getFair())
                .build();
    }

    static List<Travel> fromEntities(List<TravelEntity> travelEntities)
    {
        List<Travel> travels = new ArrayList<>();
        if(travelEntities != null)
        {
            travelEntities.stream().forEach(entity ->
                    travels.add(fromEntity(entity)));

        }

        return travels;
    }



}
