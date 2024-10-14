package com.intern.employeeAttendance.EmployeeAttendance.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intern.employeeAttendance.EmployeeAttendance.bo.AttendanceRepository;
import com.intern.employeeAttendance.EmployeeAttendance.model.Attendance;

@Service
public class AttendanceServices {
	
	@Autowired
    private AttendanceRepository attendanceRepository;
    
    public Attendance getAttendance(Long id) {
        return attendanceRepository.findById(id).orElseThrow();
    }
    
    public void saveAttendance(Attendance attendance) {
        attendanceRepository.save(attendance);
    }

}
