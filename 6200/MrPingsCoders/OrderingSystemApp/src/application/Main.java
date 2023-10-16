package application;
	
import java.lang.foreign.ValueLayout.OfChar;
import java.util.ArrayList;
import java.util.List;

import controller.FoodController;
import javafx.application.Application;
import javafx.stage.Stage;
import model.Food;
import tools.Dbinitializer;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("MySceneBuilderApp");
		primaryStage.setScene(scene);
		primaryStage.show();

		
		Dbinitializer.initDatabase();
		//这是管理员添加food
//		Food food = new Food("food2", 10, "food2 des");
//		food.addFood(food);
		
//		这是管理员查看menu，获得所有的food
		List<Food> foodList = new ArrayList<>();
		FoodController fController = new FoodController();
		foodList = fController.getFood();
		for(Food food: foodList) {
			System.out.println(food.getId()+" "+food.getName()+" "+food.getNums()+" "+food.getDescription());
		}
		
		
		//这是从menu中删除food， 需要传入要删除的id数组
//		FoodController fController = new FoodController();
//		int[] arr = {1, 2};
//		fController.deleteFood(arr);
		
		
		//根据foodname前缀查找food，需要判断返回值是否为空
//		FoodController fController = new FoodController();
//		List<Food> foodList = new ArrayList<>();
//		foodList = fController.getFood("foo");
//		if (foodList != null ){
//			for(Food food: foodList) {
//			System.out.println(food.getId()+" "+food.getName()+" "+food.getNums()+" "+food.getDescription());
//			}
//		}else {
//			System.out.println("null");
//		}
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
