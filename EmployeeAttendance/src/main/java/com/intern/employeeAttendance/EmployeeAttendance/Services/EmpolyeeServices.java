package com.intern.employeeAttendance.EmployeeAttendance.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intern.employeeAttendance.EmployeeAttendance.bo.EmployeeRepository;
import com.intern.employeeAttendance.EmployeeAttendance.model.Employee;

@Service
public class EmpolyeeServices {
	
	@Autowired
    private EmployeeRepository employeeRepository;
    
    public Employee getEmployee(Long id) {
        return employeeRepository.findById(id).orElseThrow();
    }
    
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

}
