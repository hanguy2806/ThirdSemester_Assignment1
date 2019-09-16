/*STUDENT NAME: THI THU HA NGUYEN
 * STUDENT ID: 301017727
 * DESCRIPTION: THIS IS BASE PLUS COMMISSION EMPLOYEE CLASS
 */
public class BasePlusCommissionEmployee {

	private int empId;
	private String firstName;
	private String lastName;
	private double baseSalary = 200;
	private double grossSales;
	private double commissionRate = 0.1;

	// define getter for id,name,base salary
	public int getEmpId() {
		return empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	// define getter, setter for gross salary and base salary
	public void setGrossSales(double grossSales) {
		if(grossSales >0)
			this.grossSales = grossSales;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setCommissionRate(double commissionRate) {
		if (0.1 <= commissionRate & 1 >= commissionRate) {
			this.commissionRate = commissionRate;
		}
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	// this constructor initializes all instance date members
	public BasePlusCommissionEmployee(int empId, String firstName, String lastName, double baseSalary,
			double grossSales, double commissionRate) {
		if (empId > 0) {
			this.empId = empId;
		}
		if (firstName != null) {
			this.firstName = firstName;
		}
		if (lastName != null) {
			this.lastName = lastName;
		}
		if (baseSalary > 200) {
			this.baseSalary = baseSalary;
		}		
		setGrossSales(grossSales);
		setCommissionRate(commissionRate);

	}

	public BasePlusCommissionEmployee(int empId, String firstName, String lastName, double baseSalary) {

		if (empId > 0) {
			this.empId = empId;
		}
		if (firstName != null) {
			this.firstName = firstName;
		}
		if (lastName != null) {
			this.lastName = lastName;
		}
		if (baseSalary > 200) {
			this.baseSalary = baseSalary;
		}
	}

	public double earnings() {
		return Math.round(commissionRate * grossSales / 100 + baseSalary);
	}

	@Override
	public String toString() {
		return "ID: " + this.empId + "\nFirst Name: " + this.firstName + "\nLast Name: " + this.lastName
				+ "\nBase Salary: " + this.baseSalary + "$" + "\nGross Salary: " + this.grossSales + "$"
				+ "\nCommission Rate: " + this.commissionRate + "%" + "\nEarning: " + earnings() + "$";
	}
}
