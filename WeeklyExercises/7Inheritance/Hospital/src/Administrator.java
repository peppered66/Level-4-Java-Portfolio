
public class Administrator extends Employee {
	
	protected Administrator(String employeeNumber, int salary) {
		super(employeeNumber, salary);
	}
	
	public void Admin() {
		System.out.println("The administrator ensures all departments maintain standards across paperwork and does budgeting.\n");
	}

	public String toString() {
		return "The administrator's employee number is " + employeeNumber + ", their salary is " + salary + ".\n";
	}
}
