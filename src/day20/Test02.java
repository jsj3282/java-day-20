package day20;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Test02 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		StackPane stack = new StackPane();
		stack.getChildren().addAll(new Rectangle(100, 100, Color.WHITE), new Label("Gol"));
		primaryStage.setTitle("StackPaneEx");
		primaryStage.setScene(new Scene(stack, 300, 250));
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);

	}


}
