
/*STUDENT NAME: THI THU HA NGUYEN
 * STUDENT ID: 301017727
 * DESCRIPTION: THIS IS COMMISSION EMPLOYEE CLASS
 */
import java.math.*;

public class CommissionEmployee {
	// instance variables
	private int empId;
	private String firstName;
	private String lastName;
	private double grossSales;
	private double commissionRate = 0.1;

	// getter for empID,firstname, lastname
	public int getEmpId() {
		return empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		if(grossSales >0)
			this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		if (commissionRate > 0.1 & commissionRate < 1) {
			this.commissionRate = commissionRate;
		}
	}

	// constructors
	public CommissionEmployee(int empId, String firstName, String lastName, double grossSales, double commissionRate) {
		if (empId > 0) {
			this.empId = empId;
		}
		if (firstName != null) {
			this.firstName = firstName;
		}
		if (lastName != null) {
			this.lastName = lastName;
		}
		setGrossSales(grossSales);
		setCommissionRate(commissionRate);
	}

	public CommissionEmployee(int empId, String firstName, String lastName) {
		if (empId > 0) {
			this.empId = empId;
		}
		if (firstName != null) {
			this.firstName = firstName;
		}
		if (lastName != null) {
			this.lastName = lastName;
		}
	}

	public double earnings() {
		return Math.round((commissionRate * grossSales / 100));
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub

		return "ID: " + this.empId + "\nFirst Name: " + this.firstName + "\nLast Name: " + this.lastName
				+ "\nGross Sale: " + this.grossSales + "$" + "\nCommission Rate: %2f" + this.commissionRate + "%"
				+ "\nEarning: " + earnings() + "$";
	}
}
