import java.io.*;
public class EmployeeTest{
	public static void main (String [] args){
		Employee emp0 = new Employee("Arpit Singh");
		Employee emp1 = new Employee("Bittu Singh");

		emp0.empAge(24);
		emp1.empAge(25);
		emp0.empDesignation("Software Engineer");
		emp1.empDesignation("Electical Engineer");
		emp0.empSalary(120);
		emp1.empSalary(150);
		emp0.printEmployee();
		emp1.printEmployee();
	}

}