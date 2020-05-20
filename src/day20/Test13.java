package day20;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Test13 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox vbox = new VBox(10);   //안쪽 값들과의 거리
		CheckBox chk1 = new CheckBox("chk1");
		CheckBox chk2 = new CheckBox("chk2");
		CheckBox chk3 = new CheckBox("chk3");
		
		chk1.setText("게임");
		chk2.setText("오락");
		
		chk2.setSelected(true);
		
		vbox.getChildren().addAll(chk1, chk2);
		vbox.setPrefSize(300, 200);
		
		primaryStage.setTitle("Button Test");
		primaryStage.setScene(new Scene(vbox));
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		
		launch(args);

	}


}
