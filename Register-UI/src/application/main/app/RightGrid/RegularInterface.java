package application.main.app.RightGrid;

import application.externals.MenuButtons;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;

public class RegularInterface extends GridPane{

	public RegularInterface() {
		setAlignment	(Pos.TOP_RIGHT);
		setHgap			(10);
		setVgap			(10);
		setPadding		(new Insets(20, 5, 20, 5));
		
		MenuButtons voidItem = new MenuButtons("Void Highligted Item");
		MenuButtons quantity = new MenuButtons("Quantity");
		MenuButtons Payment = new MenuButtons("Payment");
		
		voidItem.setOnAction(new EventHandler<ActionEvent>() {	
			@Override
			public void handle(ActionEvent arg0) {
				
			}
		});
		
		
		add(voidItem, 0,0);
		add(quantity, 0,1);
		add(Payment, 0,2);
		
	}
	
}
