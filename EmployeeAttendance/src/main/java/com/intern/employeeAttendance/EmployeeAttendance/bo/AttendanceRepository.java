package com.intern.employeeAttendance.EmployeeAttendance.bo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intern.employeeAttendance.EmployeeAttendance.model.Attendance;

public interface AttendanceRepository extends JpaRepository<Attendance, Long> {

}
