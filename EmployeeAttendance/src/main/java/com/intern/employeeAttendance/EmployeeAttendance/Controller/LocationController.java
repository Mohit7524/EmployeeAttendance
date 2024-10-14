package com.intern.employeeAttendance.EmployeeAttendance.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intern.employeeAttendance.EmployeeAttendance.Services.LocationServices;
import com.intern.employeeAttendance.EmployeeAttendance.model.Location;

@RestController
@RequestMapping("/api/locations")
public class LocationController {
	
	@Autowired
    private LocationServices locationServices;
    
    @GetMapping("/{id}")
    public Location getLocation(@PathVariable Long id) {
        return locationServices.getLocation(id);
    }
    
    @PostMapping
    public void saveLocation(@RequestBody Location location) {
        locationServices.saveLocation(location);
    }


}
