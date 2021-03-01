/*
 * This is a class to test and demonstrate each other class
 * @author Dylan Diedrich
 * @version 1.0
 * @since 01 March 2021
 */

public class ConstructionApplication {
//This is a main method used to create new objects for each class and then print the output in a viewable manner
	public static void main(String[] args) {
	       Building b1 = new Building("Gaines House", "123 Main Street | Louisiville Kentucky 401010", 2540, "Residential","R1");
	       
	       
	       Business bu1 = new Business("The Prancing Pony", "103 Springhill Drive | Middle Earth 40353", 1890, "Business", "B1",12);
	       
	       
	       Apartment a1 = new Apartment("Baxter Apartments", "1221 E Broadway, Louisville, KY 40204", 12000, "Apartments", "A1", 40, 80, true, 36, 680, true);
	       
	       
	       SingleFamilyHome sf1 = new SingleFamilyHome("Gaines Single Houses","121 Louis St | Louisiville Kentucky 401010", 1800, "SingleFamilyHouse", "SF1", 4, 3, true, true);

	       Mall m1 = new Mall("Oxford Mall", "1213 Newburg Road | Lousiville Kentucky 40205", 15000.0, "Mall", "B", 500, 1250.00, 3700);
	       
	       	System.out.println("-----Building Details-----\n" + b1.displayData()+"\n");

	       	System.out.println("-----Business Building Details-----\n" + bu1.toString()+"\n");

	       	System.out.println("-----Apartment Details-----\n" + a1.displayData()+"\n");

	       	System.out.println("-----Single Family Home Details-----\n" + sf1.displayData()+"\n");
	       
	       	System.out.println("-----Mall Details-----\n" + m1.displayData()+"\n");
	   }//end method
}//end class
