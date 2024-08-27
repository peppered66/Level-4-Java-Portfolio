
public class Nurse extends Employee{
int patients;
	protected Nurse(String employeeNumber, int salary, int patients) {
		super(employeeNumber, salary);
		this.patients = patients;
	}

	public  void Nursing() {
		System.out.println("The nurse takes care of patients who have been diagnosed by a doctor.\n");
	}
	public String toString() {
		return "The Nurse's employee number is " + employeeNumber + ", their salary is " + salary +  " and they are helping " + patients + " patients" + ".\n";
}
}