package day20;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Test15 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox hbox = new HBox(10);
		ToggleButton toggleBtn = new ToggleButton("Toggle Btn");
		
		toggleBtn.setText("aaaaa");
		
		hbox.getChildren().addAll(toggleBtn);
		hbox.setPrefSize(300, 200);
		
		primaryStage.setTitle("Button Test");
		primaryStage.setScene(new Scene(hbox));
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		
		launch(args);

	}


}
