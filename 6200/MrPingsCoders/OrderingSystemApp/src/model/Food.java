package model;

import controller.FoodController;

public class Food {
	// assigned index for the food
	private int id;
	// food name
	private String name;
	// count of food order
	private int nums;
	// food description, such as "smooth white noodle
	//in  a traditional bone soup made with 
	//beef brisket, scallions, onions, garlic, ginger, and spices. "
	private String description;
	// default constructor
	public Food() {
		
	}
	// overloaded constructor with 3 arguments initiation
	public Food(String name, int nums, String description) {
		this.name = name;
		this.nums = nums;
		this.description = description;
	}
	// overloaded constructor with 4 arguments initiation
	public Food(int id, String name, int nums, String description) {
		this.id = id;
		this.name = name;
		this.nums = nums;
		this.description = description;
	}
	// add the food into the database
	public void addFood(Food food) {
		FoodController fController = new FoodController();
		fController.addFood(food);
	}
	// return the id of the food
	public int getId() {
		return id;
	}
	// set the id of the food
	public void setId(int id) {
		this.id = id;
	}
	// set the id of the food
	public String getName() {
		return name;
	}
	// set the name of the food
	public void setName(String name) {
		this.name = name;
	}
	// return the number of orders of the food
	public int getNums() {
		return nums;
	}
	// set the number of orders of the food
	public void setNums(int nums) {
		this.nums = nums;
	}
	// return the description text of the food
	public String getDescription() {
		return description;
	}
	// set the description text of the food
	public void setDescription(String description) {
		this.description = description;
	}
	
}
