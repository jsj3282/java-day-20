package day20;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Test01 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		AnchorPane anchorPane = new AnchorPane();
		Button button1 = new Button("Add111");
		Button button2 = new Button("Add222");
		
		AnchorPane.setTopAnchor(button1, 10.0);
		AnchorPane.setRightAnchor(button1, 10.0);
		AnchorPane.setBottomAnchor(button2, 10.0);
		AnchorPane.setLeftAnchor(button2, 10.0);
		anchorPane.getChildren().addAll(button1, button2);
		
		primaryStage.setTitle("AnchorPaneEx");
		primaryStage.setScene(new Scene(anchorPane, 300, 250));
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);

	}


}
