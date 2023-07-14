package com.altaf.Services;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altaf.Entity.Employee;
import com.altaf.Repo.EmployeeRepo;

@Service
public class EmpService {
	
	@Autowired
	private EmployeeRepo employeerepo;
	
	public void createEmp(Employee emp) {
		this.employeerepo.save(emp);
		
			
		}
		
		public List <Employee> getAllEmp() {
			 List<Employee> list = employeerepo.findAll();
			 List<Employee> list2 = list.stream().filter(e->e.getId() % 2 != 0).collect(Collectors.toList());
			return list2;
		}
	}


