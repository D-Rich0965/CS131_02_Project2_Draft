/*
 * this is a class that inherits the residential class
 * @author Dylan Diedrich
 * @Version 1.0
 * @since 01 March 2021
 */
public class Apartment extends Residental{

	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;
	
	 //This is the default constructor used to set the variables to their base state
	public Apartment() {
	   super();
	   numRentableUnits = 0;
	   avgUnitSize = 0.0;
	   parkingAvailable = false;
	}
	
	//This is the preferred constructor and sets the variables to the parameters
	  public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subGroup, int numBedrooms, int numBathrooms, boolean laundryRoom, int numRentableUnits,double avgUnitSize, boolean parkingAvailable) {
		 super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subGroup, numBedrooms, numBathrooms, laundryRoom);
		 this.numRentableUnits = numRentableUnits;
		 this.avgUnitSize = avgUnitSize;
		 this.parkingAvailable = parkingAvailable;
	  }
	  
	//this method prints out the code being drawn for each building.
	  public void draw() {
		  System.out.println("Drawing code for " + this.getClass());
	  }
	  
	//this method prints out the description of each building types and their associated variables
	  public String displayData() {
		  String str = "";
		  str += super.toString() + "\nNumber of Rentable Units: " + numRentableUnits + "\nAverage Unit Size: " + avgUnitSize + "\nIs Parking Available: " + ((parkingAvailable == true) ? "Yes" : "No");
		  return str;
	  }
	  
	  //getter for numRentableUnits
	  //@return numRentableUnits
	  public int getNumRentableUnits() {
		  return numRentableUnits;
	  }//end getNumRentableUnits
	  
	  //setter for numRentableUnits
	  //@param numRentableUnits
	  public void setNumRentableUnits(int numRentableUnits) {
		  this.numRentableUnits = numRentableUnits;
	  }//end setNumRentableUnits
	  
	  //getter for avgUnitSize
	  //@return avgUnitSize
	  public double getAvgUnitSize() {
		  return avgUnitSize;
	  }//end getAvgUnitSize
	  
	  //setter for avgUnitSize
	  //@param avgUnitSize
	  public void setAvgUnitSize(double avgUnitSize) {
		  this.avgUnitSize = avgUnitSize;
	  }//end setAvgUnitSize
	  
	  //getter for parkingAvailable
	  //@return parkingAvailable
	  public boolean isParkingAvailable() {
		  return parkingAvailable;
	  }//end isParkingAvailable
	  
	  //setter for parkingAvailable
	  //@param parkingAvailable
	  public void setParkingAvailable(boolean parkingAvailable) {
		  this.parkingAvailable = parkingAvailable;
	  }//end setParkingAvailable
	  
	  
}//end class
