/*
 * This class is a subclass of Building, and will create the description of the Business building when executed
 * @author Dylan Diedrich
 * @version 1.0
 * @Since 01 March 2021
 */

public class Business extends Building {

	protected int numRentableUnits;
	
	 //This is the default constructor used to set the variables to their base state
  public Business() {
	  super();
	  numRentableUnits = 0;
	 
  }//end constructor
  
//This is the preferred constructor and sets the variables to the parameters 
  public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subGroup, int numRentableUnits) {
	  super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subGroup);
	  this.numRentableUnits = numRentableUnits;
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
  
  //Returns a string representation of the class instance
  //@return super
  public String toString() {
	  return super.displayData() + "\nNumber of Rentable Units: " + numRentableUnits;
  }//end method
}//end class
