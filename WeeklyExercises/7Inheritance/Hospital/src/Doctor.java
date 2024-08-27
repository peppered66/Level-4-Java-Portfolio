
public class Doctor extends Employee{
int patients;
	protected Doctor(String employeeNumber, int salary, int patients) {
		super(employeeNumber, salary);
		this.patients = patients;
		
	}
	
	public void Diagnose() {
		System.out.println("The doctor diagnoses patients who book appointments with the receptionist.\n");
	}
	public String toString() {
		return "The doctor's employee number is " + employeeNumber + ", their salary is " + salary +  " and they are diagnosing " + patients + " patients" + ".\n";
		
	}
		
	}


