package model;
// The class to story the total sale of the restaurant
public class Restaurant {
	// name of the Restaurant with its getter. Only Mr. Ping's Coders have the access to update it. Not even Mr. Ping
	// Note that a constant String is defined
	private static final String restaurantName = "Dragon Warrior Noodles & Tofu";
	public String getName() {
		// Use ClassName.variableName to access the static final variable
		return Restaurant.restaurantName;
	}
	// total amount of sale 
	private int sale;
	// return the total amount of sale 
	public int getSale() {
		return sale;
	}
	// set the total amount of sale, needed to be updated.
	public void setSale(int sale) {
		this.sale = sale;
	}
	
}
