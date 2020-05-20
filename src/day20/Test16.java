package day20;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Test16 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox hbox = new HBox();
		ToggleGroup group = new ToggleGroup();
		
		ToggleButton tb1 = new ToggleButton("Minor");
		tb1.setToggleGroup(group);
		tb1.setSelected(true);
		
		ToggleButton tb2 = new ToggleButton("Major");
		tb2.setToggleGroup(group);

		ToggleButton tb3 = new ToggleButton("Critical");
		tb3.setToggleGroup(group);
		
		hbox.getChildren().addAll(tb1, tb2, tb3);
		hbox.setPrefSize(300, 200);
		
		primaryStage.setTitle("Button Test");
		primaryStage.setScene(new Scene(hbox));
		primaryStage.show();
		
		
	}
	public static void main(String[] args) {
		
		launch(args);

	}


}
