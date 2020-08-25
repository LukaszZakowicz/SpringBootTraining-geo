package com.example.demo;

import com.example.demo.model.Geolocation;
import com.example.demo.service.GeolocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Autowired
    GeolocationService geolocationService;

//    @EventListener(ApplicationReadyEvent.class)
//    public void addGeoocationsAtStartup() {
//        geolocationController.addGeolocation
//    }

}
