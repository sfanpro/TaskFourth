package ua.com.fan.taskfourth.service;

import java.util.List;

import ua.com.fan.taskfourth.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();

	public Employee findById(int theId);

	public void save(Employee theEmployee);

	public void deleteById(int theId);
}
