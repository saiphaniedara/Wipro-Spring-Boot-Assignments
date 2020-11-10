package com.wipro.dao;

import org.springframework.data.repository.CrudRepository;

import com.wipro.bean.Employee;

public interface EmployeeDAO extends CrudRepository<Employee, Integer> {

}
