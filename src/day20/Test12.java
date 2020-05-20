package day20;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Test12 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox vbox = new VBox(10);
		Pane canvas1 = new Pane();
		Pane canvas2 = new Pane();
		Pane canvas3 = new Pane();
		
		canvas1.setStyle("-fx-background-color : red;");
		canvas1.setPrefSize(100, 50);
		
		canvas2.setStyle("-fx-background-color : black;");
		canvas2.setPrefSize(100, 50);
		
		canvas3.setStyle("-fx-background-color : blue;");
		canvas3.setPrefSize(50, 110);
		
		vbox.getChildren().addAll(canvas1, canvas2);
		
		GridPane gridPane = new GridPane();
		gridPane.add(vbox, 0 , 0);
		gridPane.add(canvas3, 1, 0);
		
		gridPane.setPadding(new Insets(10));
		gridPane.setHgap(10);
		
		Scene scene = new Scene(gridPane);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		
		launch(args);

	}


}
