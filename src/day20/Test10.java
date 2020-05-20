package day20;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Test10 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox vbox = new VBox(10);		//중간 라인의 패딩 10
		Pane canvas1 = new Pane();
		Pane canvas2 = new Pane();
		Pane canvas3 = new Pane();
		//hbox.setPadding(new Insets(10));
		vbox.setSpacing(50);
		canvas1.setStyle("-fx-background-color : blue;");
		canvas1.setPrefSize(200, 150);
		canvas2.setStyle("-fx-background-color : red;");
		canvas2.setPrefSize(200, 150);
		canvas3.setStyle("-fx-background-color : black;");
		canvas3.setPrefSize(300, 150);
		vbox.getChildren().addAll(canvas1, canvas2, canvas3);
		Scene scene = new Scene(vbox);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);

	}


}
