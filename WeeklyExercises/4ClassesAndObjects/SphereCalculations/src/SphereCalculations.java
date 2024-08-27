import java.util.Scanner;
public class SphereCalculations {

	public static void main(String[] args) {
		Sphere mySphere = new Sphere();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the radius of the sphere: ");
		mySphere.radius = scan.nextInt();
		
		mySphere.surface_area = (4 * 3.14 * (mySphere.radius * mySphere.radius));
        System.out.format("The surface area of the sphere is: " + "%.4f", mySphere.surface_area);
		System.out.println("");
		mySphere.volume = ((double)4 / 3) * 3.14 * (mySphere.radius * mySphere.radius * mySphere.radius);
        System.out.format("The volume of the sphere is: " + "%.4f", mySphere.volume);

	}
}