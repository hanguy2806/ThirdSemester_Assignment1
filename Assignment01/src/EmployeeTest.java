/*STUDENT NAME: THI THU HA NGUYEN
 * STUDENT ID: 301017727
 * DESCRIPTION: THIS IS DRIVER CLASS
 */
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Test commission employee class
		System.out.println("Test Commission Employee Class");
		System.out.println("-------------------------------------");
		CommissionEmployee ce=new CommissionEmployee(111,"Hana","Nguyen",2500.50,0.2);
		System.out.println(ce);
		System.out.println("-------------------------------------");
		CommissionEmployee ce1=new CommissionEmployee(112,"Annie","Tran");
		ce1.setGrossSales(2302.32);
		System.out.println(ce1);
		
		System.out.println("=====================================");		
		
		//Test base plus commission
		System.out.println("Test Base Plus Commission Class");
		System.out.println("-------------------------------------");
		BasePlusCommissionEmployee bpce=new BasePlusCommissionEmployee(113, "Jacob", "Marcus", 3000,2300,0.25);
		System.out.println(bpce);
		
		BasePlusCommissionEmployee bpce1=new BasePlusCommissionEmployee(114, "Janus", "Michell",2300.10);
		bpce1.setGrossSales(1232.54);
		System.out.println("-------------------------------------");
		System.out.println(bpce1);
		
		System.out.println("=====================================");
		
		//Test hourly employee class
		System.out.println("Test Hourly Employee Class");
		System.out.println("-------------------------------------");
		HourlyEmployee he=new HourlyEmployee(115,"Krissy","Robin",40,16);
		System.out.println(he);
		System.out.println("-------------------------------------");
		HourlyEmployee he1=new HourlyEmployee(102,"Sheryce","Anderson");
		he1.setHourlyRate(20.50);
		he1.setTotalHours(35);		
		System.out.println(he1);
	}

}
