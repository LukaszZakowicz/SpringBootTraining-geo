package com.example.demo.repository;

import com.example.demo.model.Geolocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GeolocationRepository extends JpaRepository<Geolocation, Integer> {

//    List<Geolocation> findAllByColor(String color);


}
