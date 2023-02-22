package com.demo.controller;

import com.demo.dto.Travel;
import com.demo.service.TravelService;
import lombok.AllArgsConstructor;
import org.apache.tomcat.jni.Address;
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
@RequestMapping("/travels")
@AllArgsConstructor
public class TravelController {

    private final TravelService travelService;

    @GetMapping
    public List<Travel> getAll()
    {
       return travelService.getTravels();
    }

}
