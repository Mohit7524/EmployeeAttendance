package com.intern.employeeAttendance.EmployeeAttendance.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intern.employeeAttendance.EmployeeAttendance.bo.LocationRepository;
import com.intern.employeeAttendance.EmployeeAttendance.model.Location;


@Service
public class LocationServices {
	
	@Autowired
    private LocationRepository locationRepository;
    
    public Location getLocation(Long id) {
        return locationRepository.findById(id).orElseThrow();
    }
    
    public void saveLocation(Location location) {
        locationRepository.save(location);
    }

}
