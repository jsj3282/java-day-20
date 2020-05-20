package day20;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Test11 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox hbox = new HBox();
		
		VBox vbox1 = new VBox(30);
		Pane canvas1 = new Pane();
		Pane canvas2 = new Pane();
		
		canvas1.setStyle("-fx-background-color : blue;");
		canvas1.setPrefSize(50, 50);
		canvas2.setStyle("-fx-background-color : blue;");
		canvas2.setPrefSize(50, 50);
		vbox1.getChildren().addAll(canvas1, canvas2);
		
		VBox vbox2 = new VBox(30);
		Pane canvas3 = new Pane();
		Pane canvas4 = new Pane();
		
		canvas3.setStyle("-fx-background-color : red;");
		canvas4.setStyle("-fx-background-color : red;");
		canvas3.setPrefSize(50, 50);
		canvas4.setPrefSize(50, 50);
		vbox2.getChildren().addAll(canvas3, canvas4);
		
		VBox vbox3 = new VBox(30);
		Pane canvas5 = new Pane();
		Pane canvas6 = new Pane();
		
		canvas5.setPrefSize(100, 50);
		canvas6.setPrefSize(100, 50);
		canvas5.setStyle("-fx-background-color : black;");
		canvas6.setStyle("-fx-background-color : black;");
		vbox3.getChildren().addAll(canvas5, canvas6);
		
		hbox.getChildren().addAll(vbox1, vbox2, vbox3);
		hbox.setSpacing(10);
		hbox.setPadding(new Insets(10)); 
		
		
		Scene scene = new Scene(hbox);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);

	}


}
