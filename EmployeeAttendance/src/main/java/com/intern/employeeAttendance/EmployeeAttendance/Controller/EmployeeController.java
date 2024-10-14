package com.intern.employeeAttendance.EmployeeAttendance.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intern.employeeAttendance.EmployeeAttendance.Services.EmpolyeeServices;
import com.intern.employeeAttendance.EmployeeAttendance.model.Employee;


@RestController
@RequestMapping("/api/employees")

public class EmployeeController {
	
	@Autowired
    private EmpolyeeServices empolyeeServices;
    
    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable Long id) {
        return empolyeeServices.getEmployee(id);
    }
    
    @PostMapping
    public void saveEmployee(@RequestBody Employee employee) {
    	empolyeeServices.saveEmployee(employee);
    }


}
