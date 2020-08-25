package com.example.demo.controller;

import com.example.demo.dto.GeolocationDto;
import com.example.demo.model.Geolocation;
import com.example.demo.service.GeolocationService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/geolocations")
public class GeolocationController {

    private final GeolocationService geolocationService;

    public GeolocationController(GeolocationService geolocationService) {
        this.geolocationService = geolocationService;
    }

    @GetMapping()
    public List<Geolocation> getAllGeolocations() {
        return geolocationService.getAllGeolocations();
    }

//    @GetMapping("/{color}")
//    public List<Geolocation> getCarsByColor(@PathVariable String color) {
//        return geolocationService.getCarsByColor(color);
//    }

    @PostMapping()
    public void addGeolocation(@Validated @RequestBody GeolocationDto geolocationDto) {
        geolocationService.addGeolocation(geolocationDto);
    }

}
