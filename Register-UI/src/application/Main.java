package application;
	
import application.main.app.LeftGrid.LeftGrid;
import application.main.app.RightGrid.RightGrid;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.VBox;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			SplitPane splitPane = new SplitPane();
			
	        VBox leftControl  = new VBox(new LeftGrid());        
	        VBox rightControl = new VBox(new RightGrid());
	        
	        splitPane.getItems().addAll(leftControl, rightControl);        
	        
	        Scene scene = new Scene(splitPane, 400, 400);
	        
	        primaryStage.setScene(scene);
	        primaryStage.setTitle("JavaFX App");
	        primaryStage.setFullScreen(true);
	        primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
