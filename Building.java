/** This is the superclass for each object in this assignment. Each subsequent class will inherit either this class,
 *  or another class that has already inherited this class
 * @author Dylan Diedrich
 * @version 1.0
 * @since 01 March 2021
 *
 */
public class Building {

	protected String projectName;
	protected String completeAddress;
	protected double totalSquareFeet;
	protected String occupancyGroup;
	protected String subGroup;
	
	
	 //This is the default constructor used to set the variables to their base state
	 
	public Building() {
		projectName = "";
		completeAddress = "";
		totalSquareFeet = 0.0;
		occupancyGroup = "";
		subGroup = "";
				
	}//end constructor
	
	//This is the preferred constructor and sets the variables to the parameters 
	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subGroup){
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subGroup = subGroup;
	}
	//this method prints out the code being drawn for each building.
	public void draw() {
		System.out.println("Drawing code for " + this.getClass());
	}//end method
	
	
	//this method prints out the description of each building types and their associated variables
	public String displayData(){
		String str = "";
		 str += "Project Name: " + projectName + "\nAddress: " + completeAddress +"\nSquare Feet: " + totalSquareFeet + "\nOccupancy Group: " + occupancyGroup + "\nOccupancy Sub-Group: " +subGroup;
		return str;
	}
	//getter for projectName
	//@return projectName
	public String getProjectName() {
		return projectName;
	}//end getProjectName
	
	//setter for projectName
	//@param projectName
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}//end setProjectName
	
	
	//getter for completeAddress
	// @return completeAddress
	public String getCompleteAddress() {
		return completeAddress;
	}//end getCompleteAddress
	
	
	//setter for completeAddress
	//@param completeAddress
	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}//end setCompleteAddress
	
	//getter for totalSquareFeet
	//@return totalSquareFeet
	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}//end getTotalSquareFeet
	
	//setter for totalSquareFeet
	//@param totalSquareFeet
	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}//end totalSquareFeet
	
	//getter for occupancyGroup
	//@return occupancyGroup
	public String getOccupancyGroup() {
		return occupancyGroup;
	}//end getOccupancyGroup
	
	//setter for occupancyGroup
	//@param occupancyGroup
	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}//end setOccupancyGroup
	
	//getter for subGroup
	//@return subGroup
	public String getSubGroup() {
		return subGroup;
	}//end getSubGroup
	
	//setter for subGroup
	//@param subGroup
	public void setSubGroup(String subGroup) {
		this.subGroup = subGroup;
	}//end subGroup
	
}//end class
