/*
 * This is a class that inherits the residential class
 * @author Dylan Diedrich
 * @version 1.0
 * @since 01 March 2021
 */
public class SingleFamilyHome extends Residental{

	private boolean garage;
	
	//This is the default constructor used to set the variables to their base state
	 public SingleFamilyHome() {
	       super();
	       garage = false;
	   }
	 
	//This is the preferred constructor and sets the variables to the parameters
	   public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
	           String subGroup, int numBedrooms, int numBathrooms, boolean laundryRoom, boolean garage) {
	       super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subGroup, numBedrooms, numBathrooms, laundryRoom);
	       this.garage = garage;
	   }

	 //this method prints out the code being drawn for each building.
	   public void draw() {
	       System.out.println("Drawing code for " + this.getClass());
	   }

	 //this method prints out the description of each building types and their associated variables
	   public String displayData() {
	       String str = "";
	       str += super.toString() + "\nGarage Available: " + ((garage == true) ? "Yes" : "No");
	       return str;
	   }

	   //getter for garage
	   //@return garage
	   public boolean isGarage() {
	       return garage;
	   }//end isGarage

	   //Setter for garage
	   //@param garage
	   public void setGarage(boolean garage) {
	       this.garage = garage;
	   }//end setGarage

	}//end class

