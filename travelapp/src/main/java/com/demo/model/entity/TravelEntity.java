package com.demo.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "Travels")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TravelEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "fair", nullable = false)
    private Float fair;

    @Column(name = "source_city_id", insertable = false,updatable = false)
    private Long sourceCityId;

    @Column(name = "destination_city_id", insertable = false,updatable = false)
    private Long destinationCityId;


    @Column(name = "start_time")
    private Instant startTime;

    @Column(name = "end_time")
    private Instant endTime;

    @ManyToOne
    @JoinColumn(name = "bus_id", referencedColumnName = "id")
    private BusEntity busEntity;

    @ManyToOne
    @JoinColumn(name = "source_city_id", referencedColumnName = "id")
    private CityEntity sourceCity;

    @ManyToOne
    @JoinColumn(name = "destination_city_id", referencedColumnName = "id")
    private CityEntity destinationCity;


}
