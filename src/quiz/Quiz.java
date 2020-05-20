package quiz;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Quiz extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		StackPane stack = new StackPane();
		BorderPane borderPane = new BorderPane();
		ImageView iv = new ImageView("/img/quiz.jpg");
		stack.getChildren().addAll(iv, borderPane);
		
		FlowPane flowTop = new FlowPane();
		flowTop.setPadding(new Insets(10, 10, 10, 250));
		flowTop.setHgap(10);
		ArrayList<Label> lb = new ArrayList<>();
		lb.add(new Label("�޴�"));
		lb.add(new Label("Ȩ"));
		lb.add(new Label("�α���"));
		flowTop.getChildren().addAll(lb);
		flowTop.setStyle("-fx-background-color:pink;");
		
		GridPane grid = new GridPane();
		//grid.setStyle("-fix-background-color:#FAF4C0;");
		grid.setPadding(new Insets(20));
		Button bt01 = new Button("���̵� �Է�");
		bt01.setPrefSize(100, 25);
		Button bt02 = new Button("��й�ȣ �Է�");
		bt02.setPrefSize(100, 25);
		Button bt03 = new Button("�α���");
		bt03.setPrefSize(60, 50);
		
		FlowPane flowBt03 = new FlowPane(bt03);
		flowBt03.setMaxSize(0, 0);
		flowBt03.setAlignment(Pos.CENTER);
		grid.getChildren().addAll(bt01, bt02);
		grid.setConstraints(bt01, 0, 0);
		grid.setConstraints(bt02, 0, 1);
		grid.setConstraints(flowBt03,  1,  0,  1,  2);
		
		AnchorPane ap = new AnchorPane();
		ListView<String> listView = new ListView<String>();
		listView.getItems().addAll("item1", "item2", "item3");
		listView.setMaxSize(100, 100);
		ap.getChildren().addAll(listView);
		
		FlowPane flowLeft = new FlowPane(ap);
		flowLeft.setMaxWidth(100);
		//flowLeft.setStyle("-fx-background-color:skyblue;");
		
		FlowPane flowCenter = new FlowPane(new Button("���� ���� ��"));
		flowCenter.setMaxSize(100, 200);
		//flowCenter.setStyle("-fx-background-color:#BCE55C;");
		
		FlowPane flowBottom = new FlowPane(new Button("�ٴڱ� ���� ��"));
		flowBottom.setMaxWidth(400);
		flowBottom.setAlignment(Pos.CENTER);
		flowBottom.setStyle("-fx-background-color:#D2916C;");
		
		borderPane.setTop(flowTop);
		borderPane.setCenter(flowCenter);
		borderPane.setBottom(flowBottom);
		borderPane.setLeft(flowLeft);
		borderPane.setRight(grid);
		
		primaryStage.setTitle("Quiz01");
		primaryStage.setScene(new Scene(stack, 400, 200));
		primaryStage.show();
	}
	public static void main(String[] args) {
		
		launch(args);

	}


}
