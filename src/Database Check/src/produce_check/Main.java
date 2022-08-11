package produce_check;
	

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import dataAPI.databaseInfo;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


public class Main extends Application {
	
	Statement stmt;
	ResultSet result;
	databaseInfo dbinfo = new databaseInfo();
	
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();	
			
			GridPane grid = new GridPane();
			grid.setAlignment(Pos.CENTER);
			grid.setHgap(10);
			grid.setVgap(10);
			grid.setPadding(new Insets(25, 25, 25, 25));
			
			Scene scene = new Scene(grid, 300, 275);
			primaryStage.setScene(scene);
			primaryStage.show();
			
			Text infotitle = new Text("Fruit Checker");
			infotitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
			grid.add(infotitle, 0, 0);
			
			Text fruitTitle = new Text("Fruit Name here");
			fruitTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 10));
			grid.add(fruitTitle, 0, 1);
			
			TextField fruitname = new TextField();
			grid.add(fruitname, 0, 2);
			
			Text codeTitle = new Text("PLU Code here");
			codeTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 10));
			grid.add(codeTitle, 0, 3);
			
			TextField fruitcode = new TextField();
			grid.add(fruitcode, 0, 4);
			
			Text priceTitle = new Text("Price / LB");
			priceTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 10));
			grid.add(priceTitle, 0, 5);
			
			TextArea price = new TextArea();
			price.setEditable(false);
			grid.add(price, 0, 6);
			
			Button getData = new Button("Get Data");
			grid.add(getData, 0, 7);
			EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					String getFruitName = fruitname .getText();
					String getFruitCode = fruitcode.getText();
					
					try {
						stmt = dbinfo.connection.createStatement();
						result = stmt.executeQuery("select * from prices where PLU_code = '"+getFruitCode+"' or Produce_Name = '"+getFruitName+"';");
						
						String code;
						String FruitName;
						String pricetag;
						
						while(result.next()) {
						
							code = result.getString("PLU_code");
							FruitName = result.getString("Produce_Name");
							pricetag = result.getString("Regular_Price");
							
							fruitname.setText(FruitName);
							fruitcode.setText(code);
							price.setText(price.getText()+"\n"+pricetag);
						
						}
						
							
					} catch (SQLException e) {
						e.printStackTrace();
					}	
				}
			};
			
			getData.setOnAction(event);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
