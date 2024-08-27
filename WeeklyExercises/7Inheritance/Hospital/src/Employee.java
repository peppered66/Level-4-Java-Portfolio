
public class Employee {
	String employeeNumber;
	int salary;
	
	protected Employee(String employeeNumber, int salary) {
		this.employeeNumber = employeeNumber;
		this.salary = salary;
	}

	 public String toString() {
	    return "The employee's number is  " + employeeNumber + " and their salary is " + salary + ".\n";
	  }
	
}
