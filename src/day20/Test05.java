package day20;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Test05 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		AnchorPane ap = new AnchorPane();
		//ImageView iv = new ImageView("/img/smilerere.png");
		ImageView iv = new ImageView();
		iv.setImage(new Image("/img/smilerere.png"));
		
		iv.setPreserveRatio(true);
		//iv.setFitHeight(100); 		//세로
		iv.setFitWidth(50); 			//가로
		
		ap.getChildren().addAll(iv);
		ap.setPrefSize(300, 200);
		
		primaryStage.setTitle("View Test");
		primaryStage.setScene(new Scene(ap));
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);

	}


}
