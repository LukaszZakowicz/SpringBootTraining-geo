package com.example.demo.controller;

import com.example.demo.model.Geolocation;
import com.example.demo.service.GeolocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/geolocation")
public class GeolocationController {

    @Autowired
    GeolocationService geolocationService;

    @GetMapping()
    public List<Geolocation> getAllGeolocations() {
        return geolocationService.getAllGeolocations();
    }

//    @GetMapping("/{color}")
//    public List<Geolocation> getCarsByColor(@PathVariable String color) {
//        return geolocationService.getCarsByColor(color);
//    }

    @PostMapping()
    public void addGeolocation(@RequestBody Geolocation geolocation) {
        geolocationService.addGeolocation(geolocation);
    }

}
