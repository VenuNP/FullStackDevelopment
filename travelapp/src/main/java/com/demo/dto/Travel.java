package com.demo.dto;

import com.demo.model.entity.Type;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.tomcat.jni.Address;

import java.time.Instant;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Travel {

    private Long busId;
    private Type busType;
    private String startingPoint;
    private String endingPoint;
    private Instant startTime;
    private Instant endTime;
    private Float fair;


}
