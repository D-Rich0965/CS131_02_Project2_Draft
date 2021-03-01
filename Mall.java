/*
 * This is a subclass of Business and will create and set the variables for the Mall specifically
 * @author Dylan Diedrich
 * @version 1.0
 * @since 01 March 2021
 */
public class Mall extends Business {

	private int numRentedUnits;
	private double medianUnitSize;
	private int numParkingSpaces;
	
	//This is the default constructor used to set the variables to their base state
	public Mall() {
		super();
		numRentedUnits = 0;
		medianUnitSize = 0.0;
		numParkingSpaces = 0;
		
	}
	
	//This is the preferred constructor and sets the variables to the parameters 
	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subGroup, int numRentedUnits, double medianUnitSize, int numParkingSpaces) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subGroup, numParkingSpaces);
		this.medianUnitSize = medianUnitSize;
		this.numParkingSpaces = numParkingSpaces;
		this.numRentedUnits = numRentedUnits;
	}
	
	//this method prints out the code being drawn for each building.
	public void draw() {
		System.out.println("Drawing Code for " + this.getClass());
	}
	
	//this method prints out the description of each building types and their associated variables
	public String displayData() {
		String str = "";
		str += super.toString() + "\nNumber of Rented Units: " + numRentedUnits + "\nMedian Unit Size: " + medianUnitSize + "\nNumber of Parking Spaces: " + numParkingSpaces;
		return str;
	}
	
	//getter for numRentedUnits
	//@return numRentedUnits
	public int getNumRentedUnits() {
		return numRentedUnits;
	}//end getNumRentedUnits
	
	//setter for numRentedUnits
	//@param numRentedUnits
	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}//end setNumRentedUnits
	
	//getter for medianUnitSize
	//@return medianUnitSize
	public double getMedianUnitSize() {
		return medianUnitSize;
	}//end getMedianUnitSize
	
	//setter for medianUnitSize
	//@param medianUnitSize
	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}//end setMedianUnitSize
	
	//getter for numParkingSpaces
	//@return numParkingSpaces
	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}//end getNumParkingSpaces
	
	//setter for numParkingSpaces
	//@param numParkingSpaces
	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}//end setNumParkingSpaces
}//end class
