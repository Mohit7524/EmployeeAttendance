package com.intern.employeeAttendance.EmployeeAttendance.bo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intern.employeeAttendance.EmployeeAttendance.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
