import java.util.Scanner;

class Individual {
    public String forename;
    public String surname;
    public String postCode;

    public Individual(String forename, String surname, String postCode) {
        this.forename = forename;
        this.surname = surname;
        this.postCode = postCode;
    }
    public String getForename() {
        return forename;
    }

    public String getSurname() {
        return surname;
    }

    public String getPostCode() {
        return postCode;
    }
}
public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        Individual[] people = new Individual[25];
        int count = 0;

        System.out.println("Enter up to 25 pairs of names and postal codes (separate by tab):");
        while (scan.hasNextLine() && count < 25) {
            String line = scan.nextLine();
            String[] parts = line.split("\t", 3);
            if (parts.length == 3) {
                people[count] = new Individual(parts[0], parts[1], parts[2]);
                count++;
            } 
           
            
        }

        System.out.println("List of individuals:");
        for (int i = 0; i < count; i++) {
            System.out.println("Name: " + people[i].getForename() + " " + people[i].getSurname() + ", Post Code: " + people[i].getPostCode());
        }
	}
}