package com.app.service;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.app.entity.Employee;
import com.app.exception.EmployeeNotFoundException;

public interface IEmployeeService {
	Integer saveEmployee(Employee e);
	void updateEmployee(Employee e);
	void deleteEmployee(Integer id)
			throws EmployeeNotFoundException;
	Employee getOneEmployee(Integer id)
			throws EmployeeNotFoundException;
	List<Employee> getAllEmployees();
	Page<Employee> getAllEmployees(Pageable pageable);
}
