package day20;



import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Test03 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		StackPane stack = new StackPane();
		Rectangle rect = new Rectangle(150, 100, Color.RED);
		Label lbl = new Label("Gol");
		//POS. 좌표를 이용한 위치 설정
		StackPane.setAlignment(lbl, Pos.TOP_LEFT);
		StackPane.setAlignment(rect, Pos.BOTTOM_RIGHT);
		stack.getChildren().addAll(rect, lbl);
		
		
		primaryStage.setTitle("StackPaneEx");
		primaryStage.setScene(new Scene(stack, 300, 250));
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);

	}


}
