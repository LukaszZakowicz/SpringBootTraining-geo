package com.example.demo.service;

import com.example.demo.model.Geolocation;
import com.example.demo.repository.GeolocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class GeolocationService {

    @Autowired
    GeolocationRepository geolocationRepository;

    public List<Geolocation> getAllGeolocations() {
        return geolocationRepository.findAll();
    }

//    public List<Geolocation> getCarsByColor(String color) {
//        return geolocationRepository.findAllByColor(color);
//    }

    public void addGeolocation(Geolocation geolocation) {
        geolocation.setTimestamp();
        geolocationRepository.save(geolocation);
    }
}
