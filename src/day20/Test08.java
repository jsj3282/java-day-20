package day20;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Test08 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane gridPane = new GridPane();
		BorderPane borderPane = new BorderPane();
	
		GridPane canvas0 = new GridPane();
		Button btn1 = new Button("���̵� �Է�");
		Button btn2 = new Button("��й�ȣ �Է�");
		Button btn3 = new Button("�α���");
		btn1.setPrefSize(100, 25);
		btn2.setPrefSize(100, 25);
		btn3.setPrefSize(70, 50);
		canvas0.add(btn1, 0, 0);
		canvas0.add(btn2, 0, 1);
		canvas0.add(btn3, 1, 0, 1, 2);
		//canvas0.getChildren().addAll(btn1, btn2, btn3);
		canvas0.setAlignment(Pos.CENTER);
		//canvas0.setStyle("-fx-background-color: #FAECC5;");
		canvas0.setPrefSize(400, 600);
		//gridPane.add(canvas0, 1, 3, 3, 3);
		//��ư������ : btn.setPrefSize
		//pane������ : pane.setPrefSize
		
		FlowPane canvas1 = new FlowPane();
		canvas1.getChildren().add(new Label("�޴� Ȩ �α���"));
		canvas1.setAlignment(Pos.TOP_RIGHT);
		canvas1.setStyle("-fx-background-color: #FFB2D9;");
	
		//gridPane.add(canvas1, 0, 0, 3, 1);   //����, ����, ���κ���, ���κ���
		
		AnchorPane canvas2 = new AnchorPane();
		ListView<String> listView = new ListView<String>();
		listView.getItems().addAll("item1", "item2", "item3");
		listView.setPrefSize(100, 130);
		canvas2.getChildren().addAll(listView);
		canvas2.setPrefSize(150, 600);
		//
		FlowPane canvas3 = new FlowPane();
		canvas3.getChildren().add(new Button("���� ���� ��"));
		canvas3.setAlignment(Pos.TOP_CENTER);
		//canvas3.setStyle("-fx-background-color: #BCE55C;");
		canvas3.setPrefSize(100, 600);
		//gridPane.add(canvas3, 1,  1, 1, 1);
		
		FlowPane canvas4 = new FlowPane();
		canvas4.getChildren().add(new Button("�ٴڱ� ���� ��"));
		canvas4.setAlignment(Pos.BOTTOM_CENTER);
		//canvas4.setStyle("-fx-background-color: #F29661;");
		
		borderPane.setTop(canvas1);
		borderPane.setLeft(canvas2);
		borderPane.setCenter(canvas3);
		borderPane.setRight(canvas0);
		borderPane.setBottom(canvas4);
		
		StackPane sp = new StackPane();
		ImageView iv = new ImageView();
		iv.setImage(new Image("/img/view.jpg"));
		iv.setFitHeight(200);
		iv.setFitWidth(600);
		
		sp.getChildren().addAll(iv, borderPane);
			
		primaryStage.setTitle("Quiz01");
		primaryStage.setScene(new Scene(sp, 700, 300));
		primaryStage.show();

	}
	public static void main(String[] args) {
		launch(args);

	}


}
