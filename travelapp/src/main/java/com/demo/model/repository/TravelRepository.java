package com.demo.model.repository;

import com.demo.model.entity.CityEntity;
import com.demo.model.entity.TravelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelRepository extends JpaRepository<TravelEntity,Long> {
}
