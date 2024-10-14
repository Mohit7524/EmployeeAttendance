package com.intern.employeeAttendance.EmployeeAttendance.bo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intern.employeeAttendance.EmployeeAttendance.model.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {

}
