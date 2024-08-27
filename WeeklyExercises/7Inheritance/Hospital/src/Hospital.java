
public class Hospital {

	public static void main(String[] args) {
		Doctor Doctor1 = new Doctor("44", 20000, 33);
		Doctor1.Diagnose();
		System.out.println(Doctor1.toString());
		
		Nurse Nurse1 = new Nurse("12", 15000, 21);
		Nurse1.Nursing();
		System.out.println(Nurse1.toString());
		
		Administrator Administrator1 = new Administrator("1", 10000);
		Administrator1.Admin();
		System.out.println(Administrator1.toString());
		
		Receptionist Receptionist1 = new Receptionist("3", 12000, "Blue");
		Receptionist1.Reception();
		System.out.println(Receptionist1.toString());
		
	}

}
