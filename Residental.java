/*
 * This is a subclass of building that will include other classes of buildings people can live in
 * @author Dylan Diedrich
 * @Version 1.0
 * @since 01 March 2021
 */
public class Residental extends Building{

	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;
	
	//This is the default constructor used to set the variables to their base state
	public Residental() {
		super();
		numBedrooms = 0;
		numBathrooms = 0;
		laundryRoom = false;
	}
	//This is the preferred constructor and sets the variables to the parameters 
	public Residental(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subGroup, int numBedrooms, int numBathrooms, boolean laundryRoom) {
		this.numBedrooms = numBedrooms;
		this.numBathrooms = numBathrooms;
		this.laundryRoom = laundryRoom;
	}
	//getter for numBedrooms
	//@return numBedrooms
	public int getNumBedrooms() {
		return numBedrooms;
	}//end getNumBedrooms
	
	//setter for numBedrooms
	//@param numBedrooms
	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}//end setNumBedrooms
	
	//getter for numBathrooms
	//@return numBathrooms
	public int getNumBathrooms() {
		return numBathrooms;
	}//end getNumBathrooms
	
	//setter for numBathrooms
	//@param numBathrooms
	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}//end setNumBathrooms
	
	//getter for laundryRoom
	//@return laundryRoom
	public boolean isLaundryRoom() {
		return laundryRoom;
	}//end isLaundryRoom
	
	//setter for laundryRoom
	//@param laundryRoom
	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}//end setLaundryRoom
	
	//Returns a string representation of the class instance
	  //@return super
	public String toString() {
		return super.displayData() + "\nNumber of Bedrooms: " + numBedrooms + "\nNumber of Bathrooms: " + numBathrooms +  "\nHas Laundry Room: " + ((laundryRoom == true) ? "Yes" : "No");
	}//end method
}//end class
