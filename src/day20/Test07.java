package day20;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Test07 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		AnchorPane ap = new AnchorPane();
		ListView<String> listView = new ListView<String>();
		listView.getItems().addAll("item1", "item2", "item3");
		
		listView.setPrefSize(100, 70);
		listView.setLayoutX(20);
		listView.setLayoutY(20);
		
		ap.getChildren().addAll(listView);
		ap.setPrefSize(300, 200);
		
		primaryStage.setTitle("View Test");
		primaryStage.setScene(new Scene(ap));
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		
		launch(args);

	}


}
