package controller;

import java.util.List;

import model.Food;

public interface IFoodController {
	// 
	void addFood(Food food);
	List<Food> getFood();
	void deleteFood(int[] ids);
	List<Food> getFood(String name);
}
