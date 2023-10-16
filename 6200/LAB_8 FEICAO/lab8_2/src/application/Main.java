package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application {
	public static void main(String[] args) {
        launch(args);
    }

	@Override
    public void start(Stage primaryStage) {
        // Set up the rectangles for the bar chart
		
		//先创建了四个长方形
        Rectangle projectRect = new Rectangle(0, 0, 150, 350 * 0.35);
        projectRect.setFill(Color.BLUE);//颜色
        Text projectText = new Text("Project--35%");//文本

        Rectangle examsRect = new Rectangle(0, 0, 150, 350 * 0.30);
        examsRect.setFill(Color.GREEN);
        Text examsText = new Text("Exams--30%");

        Rectangle assignmentsRect = new Rectangle(0, 0, 150, 350 * 0.30);
        assignmentsRect.setFill(Color.RED);
        Text assignmentsText = new Text("Assignments--30%");

        Rectangle attendanceRect = new Rectangle(0, 0, 150, 350 * 0.05);
        attendanceRect.setFill(Color.ORANGE);
        Text attendanceText = new Text("Attendance--5%");

        // Set up the VBox to hold the rectangles and text
        HBox chart = new HBox(10);//水平方向上相邻的子节点之间的间距，这里是10
        chart.setPadding(new Insets(20));//和顶部差多少距离
        chart.setAlignment(Pos.BASELINE_CENTER);
        chart.getChildren().addAll(
                createStackPane(projectRect, projectText),
                createStackPane(examsRect, examsText),
                createStackPane(assignmentsRect, assignmentsText),
                createStackPane(attendanceRect, attendanceText)
        );

        // Set up the scene and show the stage
        Scene scene = new Scene(chart, 700, 180);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Lab_problem2 FEICAO");
        primaryStage.show();
    }

	//
    private StackPane createStackPane(Rectangle rect, Text text) {
        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(rect, text);
        StackPane.setAlignment(text, Pos.BASELINE_CENTER);
        StackPane.setMargin(text, new Insets(10, 0, 0, 0));
        return stackPane;
    }
}