package com.intern.employeeAttendance.EmployeeAttendance.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intern.employeeAttendance.EmployeeAttendance.Services.AttendanceServices;
import com.intern.employeeAttendance.EmployeeAttendance.model.Attendance;

@RestController
@RequestMapping("/api/attendances")

public class AttendanceController {
	
	@Autowired
    private AttendanceServices attendanceServices;
    
    @GetMapping("/{id}")
    public Attendance getAttendance(@PathVariable Long id) {
        return attendanceServices.getAttendance(id);
    }
    
    @PostMapping
    public void saveAttendance(@RequestBody Attendance attendance) {
        attendanceServices.saveAttendance(attendance);
    }

}
