
public class Sphere {
	private int diameter;
	//constructor method which initialises diameter data
	public Sphere(int diameter) {
		this.diameter = diameter;
	}
	//get method
	public int getDiameter() {
		return diameter;
	}
	//set method
	public void setDiameter(int newDiameter) {
		this.diameter = newDiameter;
	}
	//method to return volume
	public double calculateVolume()
	  {
	    return Math.round((Math.PI) * (Math.pow(diameter, 3.0) / 6.0));
	  }
	//method to return surface area
	 public double calculateSurfaceArea()
	  {
	    return Math.round((Math.PI) * Math.pow(diameter, 2.0));   
	  }

	// string which contains return methods displaying their values
	public String toString() {
	return "Diameter: " + diameter + "\nVolume: " + calculateVolume()  + "\nSurface Area: " + calculateSurfaceArea();

	}
	
}
