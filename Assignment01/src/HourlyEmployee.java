/*STUDENT NAME: THI THU HA NGUYEN
 * STUDENT ID: 301017727
 * DESCRIPTION: THIS IS HOURLY EMPLOYEE CLASS
 */
import java.math.*;
public class HourlyEmployee {
	private int empId;
	private String firstName;
	private String lastName;
	private int totalHours;
	private double hourlyRate;

	public int getEmpId() {
		return empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getTotalHours() {
		return totalHours;
	}

	public void setTotalHours(int totalHours) {
		this.totalHours = totalHours;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		if (hourlyRate >= 14) {
			this.hourlyRate = hourlyRate;
		}
	}

	public HourlyEmployee(int empId, String firstName, String lastName, int totalHours, double hourlyRate) {
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.totalHours = totalHours;
		this.hourlyRate = hourlyRate;
	}

	public HourlyEmployee(int empId, String firstName, String lastName) {
		// TODO Auto-generated constructor stub
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public double earning() {
		return Math.round(totalHours * hourlyRate);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID: "+this.empId+"\nFirst Name: "+this.firstName+"\nLast Name: "+this.lastName+
				"\nTotal working hours: "+this.totalHours+" hours"+"\nHourly rate: "+this.hourlyRate+"$"+"\nEarning:"+earning()+"$";
	}
}
