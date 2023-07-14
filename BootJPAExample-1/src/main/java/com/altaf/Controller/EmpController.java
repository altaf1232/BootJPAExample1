package com.altaf.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.altaf.Entity.Employee;
import com.altaf.Services.EmpService;

@RestController
public class EmpController {

	@Autowired
	private EmpService empService;

	@PostMapping("/altaf")
	public void createEmp(@RequestBody Employee emp) {
		System.out.println("dhfhgfg");
		this.empService.createEmp(emp);
	}
	
	@GetMapping("/getall")
	public List<Employee> getAll(){
		List<Employee> emp = empService.getAllEmp();
		return emp;
	}
}
