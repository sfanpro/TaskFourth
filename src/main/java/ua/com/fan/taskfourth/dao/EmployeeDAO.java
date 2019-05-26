package ua.com.fan.taskfourth.dao;

import java.util.List;

import ua.com.fan.taskfourth.entity.Employee;

public interface EmployeeDAO {

	public List<Employee> findAll();

	public Employee findById(int theId);

	public void save(Employee theEmployee);

	public void deleteBeId(int theId);
}
