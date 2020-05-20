package day20;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;

import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Test06 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox hb = new HBox();
		AnchorPane ap = new AnchorPane();
		ImageView iv1 = new ImageView("/img/smilerere.png");
		ImageView iv2 = new ImageView("/img/smilerere.png");
		
		//iv2.setRotate(45);
		Rectangle2D viewportRect = new Rectangle2D(40, 35, 110, 110);
		//왼(x), 위(y), x박스크기, y박스크기
		iv2.setViewport(viewportRect);
		iv2.setLayoutX(40);  	//위치 x
		iv2.setLayoutY(35);  	//위치 y
		ap.getChildren().addAll(iv2);
		hb.getChildren().addAll(iv1, ap);
		hb.setPrefSize(1024, 768);
		
		primaryStage.setScene(new Scene(hb, 400, 200));
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}


}
