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

    @EventListener(ApplicationReadyEvent.class)
    public void addCarsAtStartup() {
        geolocationService.addGeolocation(new Geolocation((long)1, 1.1, 1.29));
        geolocationService.addGeolocation(new Geolocation((long)1, 1.2, 1.28));
        geolocationService.addGeolocation(new Geolocation((long)2, 1.3, 1.27));
        geolocationService.addGeolocation(new Geolocation((long)3, 1.4, 1.26));
        geolocationService.addGeolocation(new Geolocation((long)1, 1.5, 1.25));
        geolocationService.addGeolocation(new Geolocation((long)2, 1.6, 1.24));
        geolocationService.addGeolocation(new Geolocation((long)3, 1.7, 1.23));
        geolocationService.addGeolocation(new Geolocation((long)3, 1.8, 1.22));
        geolocationService.addGeolocation(new Geolocation((long)3, 1.9, 1.21));
        geolocationService.addGeolocation(new Geolocation((long)1, 1.10, 1.20));
    }

}
