package com.example.demo.service;

import com.example.demo.dto.GeolocationDto;
import com.example.demo.model.Geolocation;
import com.example.demo.repository.GeolocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public void addGeolocation(GeolocationDto geolocationDto) {
        Geolocation geolocation = new Geolocation();
        geolocation.setId(geolocationDto.getId());
        geolocation.setDeviceId(geolocationDto.getDeviceId());
        geolocation.setLatitude(geolocationDto.getLatitude());
        geolocation.setLongitude(geolocationDto.getLongitude());
        geolocation.setCurrentTimestamp();
        geolocationRepository.save(geolocation);
    }
}
