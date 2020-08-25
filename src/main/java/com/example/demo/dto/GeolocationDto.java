package com.example.demo.dto;

import com.example.demo.model.Geolocation;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import java.sql.Timestamp;

public class GeolocationDto {

    @Min(1)
    private Long id;
    @Min(1)
    private Long deviceId;
    @DecimalMin(value = "-90",message = "Latitude too low")
    @DecimalMax(value = "90",message = "Latitude too high")
    private Double latitude;
    @DecimalMin(value = "-180",message = "longitude too low")
    @DecimalMax(value = "180",message = "Longitude too high")
    private Double longitude;

    public GeolocationDto() {
    }

    public GeolocationDto(Geolocation geolocation) {
        this.id = geolocation.getId();
        this.deviceId = geolocation.getDeviceId();
        this.latitude = geolocation.getLatitude();
        this.longitude = geolocation.getLongitude();
    }

    public Long getId() {
        return id;
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

}
