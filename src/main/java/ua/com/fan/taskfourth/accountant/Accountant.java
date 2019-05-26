package ua.com.fan.taskfourth.accountant;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import ua.com.fan.taskfourth.employees.EmployeeAbstract;

public class Accountant {

	public Map<EmployeeAbstract, Double> getSalary(List<EmployeeAbstract> employees) {
		Map<EmployeeAbstract, Double> mapSalary = new Hashtable<EmployeeAbstract, Double>();
		for (EmployeeAbstract employee : employees) {
			mapSalary.put(employee, employee.calculateSalary());
		}
		return mapSalary;
	}
}
