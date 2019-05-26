package ua.com.fan.taskfourth.employees;

public class Developer extends EmployeeAbstract {

	public Developer(int id, String firstName, String lastName, double rate, double hoursInMounth, double workedHour,
			String position) {
		super(id, firstName, lastName, rate, hoursInMounth, workedHour, position);
	}

	public Developer() {
	}

	@Override
	public double calculateSalary() {
		double salary = super.getRate() * super.getWorkedPercent();
		return salary;
	}

}
