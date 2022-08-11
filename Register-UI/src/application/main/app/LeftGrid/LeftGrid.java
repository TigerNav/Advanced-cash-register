package application.main.app.LeftGrid;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import application.externals.InfoArea;
import application.main.app.RightGrid.RightGrid;

public class LeftGrid extends GridPane{

	InfoArea textarea;
	TextField Plu;
	
	public LeftGrid() {
		
		textarea			= new InfoArea();
		Text version 		= new Text("Version : BETA"); version.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
		Text Date			= new Text("Date : " + new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime())); Date.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 15));
		Text Time			= new Text(); Time.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 15));
		Text User			= new Text("User : "); User.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 15));
		Text Tax			= new Text("Tax : "); Tax.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 15));
		Text Total			= new Text("Total : "); Total.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 15));
		Text PluText		= new Text("PLU#"); PluText.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 15));
		Plu					= new TextField(); Plu.setPrefSize(800, 50);
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {				
					Time.setText("Time : " + new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()));
				}
			}
		}).start();
		
		
		
		setAlignment	(Pos.TOP_LEFT);
		setHgap			(10);
		setVgap			(10);
		setPadding		(new Insets(5, 5, 5, 5));
		add(version, 0, 0);
		add(Date, 0, 1);
		add(Time, 0, 2);
		add(User, 0, 3);
		add(PluText, 0, 5);
		add(Plu, 0, 6);
		add(textarea, 0, 7);
		add(Tax, 0, 8);
		add(Total, 0, 9);
		
	}
	
	public String getPLUText() {
		return Plu.getText();
	}
	public void setInfoArea(String text) {
		textarea.setText(text);
	}

}
