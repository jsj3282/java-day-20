package day20;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Test14 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox hbox = new HBox(10);
		RadioButton rb1 = new RadioButton("rb1");
		RadioButton rb2 = new RadioButton("rb2");
		
		ToggleGroup tg = new ToggleGroup();
		rb1.setToggleGroup(tg);
		rb2.setToggleGroup(tg);
		
		hbox.setPadding(new Insets(10));
		HBox.setMargin(rb1, new Insets(30, 30, 0, 0));
		
		rb1.setSelected(true);
		
		rb1.setText("남자");
		rb2.setText("여자");
		
		hbox.getChildren().addAll(rb1, rb2);
		hbox.setPrefSize(300, 200);
		
		primaryStage.setTitle("Button Test");
		primaryStage.setScene(new Scene(hbox));
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);

	}


}
