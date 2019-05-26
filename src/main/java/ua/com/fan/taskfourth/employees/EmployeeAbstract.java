package ua.com.fan.taskfourth.employees;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public abstract class EmployeeAbstract {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "rate")
	private double rate;

	@Column(name = "hours_in_mounth")
	private double hoursInMounth;

	@Column(name = "worked_hour")
	private double workedHour;

	@Column(name = "position")
	private String position;

	public EmployeeAbstract() {
	}

	public EmployeeAbstract(int id, String firstName, String lastName, double rate, double hoursInMounth,
			double workedHour, String position) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.rate = rate;
		this.hoursInMounth = hoursInMounth;
		this.workedHour = workedHour;
		this.position = position;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getHoursInMounth() {
		return hoursInMounth;
	}

	public void setHoursInMounth(double hoursInMounth) {
		this.hoursInMounth = hoursInMounth;
	}

	public double getWorkedHour() {
		return workedHour;
	}

	public void setWorkedHour(double workedHour) {
		this.workedHour = workedHour;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public double getWorkedPercent() {
		double workedPersent = workedHour / hoursInMounth;
		return workedPersent;
	}

	public abstract double calculateSalary();
}
