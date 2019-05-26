package ua.com.fan.taskfourth.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import ua.com.fan.taskfourth.enam.Post;

@Entity
@Table(name = "employee")
public class Employee {

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
	@Enumerated(EnumType.STRING)
	private Post position;

	@Column(name = "salary")
	private double salary;

	public Employee() {
	}

	public Employee(int id, String firstName, String lastName, double rate, double hoursInMounth, double workedHour,
			Post position, double salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.rate = rate;
		this.hoursInMounth = hoursInMounth;
		this.workedHour = workedHour;
		this.position = position;
		this.salary = salary;
	}

	public Employee(String firstName, String lastName, double rate, double hoursInMounth, double workedHour,
			Post position, double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.rate = rate;
		this.hoursInMounth = hoursInMounth;
		this.workedHour = workedHour;
		this.position = position;
		this.salary = salary;
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

	public Post getPosition() {
		return position;
	}

	public void setPosition(Post position) {
		this.position = position;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
