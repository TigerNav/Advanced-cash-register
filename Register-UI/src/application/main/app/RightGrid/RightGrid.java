package application.main.app.RightGrid;


import application.externals.MenuButtons;
import application.externals.States;
import application.main.app.LeftGrid.LeftGrid;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;

public class RightGrid extends GridPane{

	RegularInterface reginter = new RegularInterface();
	
	States states = States.Regular;
	
	public RightGrid() {
		
		switch(states) {
		
		case Regular:
			break;
		case Quantity:
			break;
		case Payment:
			break;
		
		}
		add(reginter,0,0);
		
		MenuButtons Enter   = new MenuButtons("Enter");
		Enter.setOnAction(new EventHandler<ActionEvent>() {
			
		String textString;
		@Override
		public void handle(ActionEvent arg0) {
				
			
			
		}});
		add(Enter,0,7);
	}
	

}
