package ua.com.fan.taskfourth.employees;

public class Manager extends EmployeeAbstract {

	public Manager(int id, String firstName, String lastName, double rate, double hoursInMounth, double workedHour,
			String position) {
		super(id, firstName, lastName, rate, hoursInMounth, workedHour, position);
	}

	public Manager() {
	}

	@Override
	public double calculateSalary() {
		double salary = super.getRate() * super.getWorkedPercent();

		if (getWorkedPercent() < 1) {
			return salary;
		}
		return getRate();
	}
}
