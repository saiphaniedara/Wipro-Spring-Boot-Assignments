package com.wipro.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.bean.Employee;
import com.wipro.dao.EmployeeDAO;

@RestController
public class EMSController {
	@Autowired
	EmployeeDAO dao;
	
	@PostMapping("/addEmployee")
	public String addemployee(Employee emp) {
		dao.save(emp);
		return "Employee Added Successfully";
	}
	@GetMapping("/getEmployee/{eid}")
	public Optional<Employee> getEmployee(@PathVariable int eid) {
		return dao.findById(eid);
	}
	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployees() {
		return dao.findAll();
	}
	@PutMapping("/updateEmployee")
	public String updateEmployee(Employee emp) {
		dao.save(emp);
		return "Employee Details updated Successfully";
	}
	@DeleteMapping("/deleteEmployee/{eid}")
	public String deleteEmployee(@PathVariable int eid) {
		dao.deleteById(eid);
		return "Employee Deleted Successfully";
	}
}
