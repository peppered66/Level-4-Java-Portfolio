
public class Receptionist extends Employee{
String helpdesk;
	protected Receptionist(String employeeNumber, int salary, String helpdesk) {
		super(employeeNumber, salary);
		this.helpdesk = helpdesk;
	}

	public void Reception() {
		System.out.println("The receptionist helps visitors with enquiries, and helps patients book appointments with doctors.\n");
	}
	public String toString() {
		return "The receptionist's employee number is " + employeeNumber + ", their salary is " + salary +  " they work on the helpdesk " + helpdesk + ".\n";
}
}