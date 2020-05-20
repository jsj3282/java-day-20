package day20;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Test17 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox hbox = new HBox(10);
		ToggleButton toggleBtn = new ToggleButton("", new ImageView("/img/magi.png"));
		
		ToggleButton toggleBtn01 = new ToggleButton();
		toggleBtn01.setGraphic(new ImageView("/img/magi.png"));
		
		
		hbox.getChildren().addAll(toggleBtn, toggleBtn01);
		hbox.setPrefSize(300, 100);
		
		primaryStage.setTitle("Button Test");
		primaryStage.setScene(new Scene(hbox));
		primaryStage.show();
		
		
	}
	public static void main(String[] args) {
		
		launch(args);

	}


}
