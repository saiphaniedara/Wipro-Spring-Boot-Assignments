package com.wipro.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.wipro.bean.Employee;
import com.wipro.dao.EmployeeDAO;

@Controller
public class EMSController {
	
	@Autowired
	EmployeeDAO dao;
	
	@RequestMapping("/")
	public String gotoHome() {
		return "Home";
	}
	@RequestMapping("/add") 
	public String gotoInsert() {
		return "AddEmployee";
	}
	@RequestMapping("/addEmployee")
	public ModelAndView addEmployee(@RequestParam int eid, @RequestParam String ename, @RequestParam double esalary) {
		Employee emp = new Employee(eid, ename, esalary);
		ModelAndView mv = new ModelAndView();
		try {
			dao.save(emp);
			mv.addObject("msg", "Employee Details Added Successfully.....");
		}
		catch (Exception e) {
			mv.addObject("msg", "Adding Employee Failed. Please Try Again.....");
		}
		mv.setViewName("Result");
		return mv;
	}
	@RequestMapping("/update")
	public ModelAndView findAndUpdate() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("title", "Find and Update");
		mv.addObject("head", "Enter the Employee Id whose details needs to be Updated");
		mv.addObject("submit", "Find Employee to Update");
		mv.addObject("action", "updateEmployee");
		mv.setViewName("FindEmployee");
		return mv;
	}
	@RequestMapping("/updateEmployee")
	public ModelAndView getUpdatePage(@RequestParam int eid) {
		ModelAndView mv = new ModelAndView();
		Optional<Employee> e = dao.findById(eid);
		if(e.isEmpty()) {
			mv.addObject("msg", "No such Employee Found. Please try Again...");
			mv.setViewName("Result");
		}
		else {
			mv.addObject("emp", e.get());
			mv.setViewName("UpdateEmployee");
		}
		return mv;
	}
	@RequestMapping("/updateEmp")
	public ModelAndView updateEmployee(@RequestParam int eid, @RequestParam String ename, @RequestParam double esalary) {
		Employee emp = new Employee(eid, ename, esalary);
		dao.deleteById(eid);
		dao.save(emp);
		ModelAndView mv = new ModelAndView("Result");
		mv.addObject("msg", "Employee Details Updated Successfully....");
		return mv;
	}
	@RequestMapping("/delete")
	public ModelAndView findAndDelete() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("title", "Find and Delete");
		mv.addObject("head", "Enter the Employee Id who needs to be Deleted");
		mv.addObject("submit", "Find Employee to Delete");
		mv.addObject("action", "deleteEmployee");
		mv.setViewName("FindEmployee");
		return mv;
	}
	@RequestMapping("/deleteEmployee")
	public ModelAndView getDeletePage(@RequestParam int eid) {
		Optional<Employee> e = dao.findById(eid);
		ModelAndView mv = new ModelAndView();
		if(e.isEmpty()) {
			mv.addObject("msg", "No such Employee Found...");
			mv.setViewName("Result");
		}
		else {
			mv.addObject("emp", e.get());
			mv.setViewName("DeleteEmployee");
		}
		return mv;
	}
	@RequestMapping("/deleteEmp")
	public ModelAndView deleteEmployee(@RequestParam int eid) {
		dao.deleteById(eid);
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", "Employee Deleted Successfully....");
		mv.setViewName("Result");
		return mv;
	}
	@RequestMapping("/find")
	public ModelAndView findAndDisplay() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("title", "Find And Display");
		mv.addObject("head", "Enter Employee Id to Find And Display Employee");
		mv.addObject("action", "findEmployee");
		mv.addObject("submit", "Search Employee");
		mv.setViewName("FindEmployee");
		return mv;
	}
	@RequestMapping("/findEmployee")
	public ModelAndView displayEmployee(@RequestParam int eid) {
		Optional<Employee> e = dao.findById(eid);
		ModelAndView mv = new ModelAndView();
		if(e.isEmpty()) {
			mv.addObject("msg", "No Employee with entered Employee Id is found....");
			mv.setViewName("Result");
		}
		else {
			mv.addObject("emp", e.get());
			mv.setViewName("DisplayEmployee");
		}
		return mv;
	}
	@RequestMapping("/displayAll")
	public ModelAndView displayAllEmployees() {
		List<Employee> list = (List<Employee>) dao.findAll();
		ModelAndView mv = new ModelAndView();
		if(list.size()==0) {
			mv.addObject("msg", "No Employee Details Present in the Database....");
			mv.setViewName("Result");
		}
		else {
			mv.addObject("emps", list);
			mv.setViewName("DisplayEmployees");
		}
		return mv;
	}
}
