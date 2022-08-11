package application.externals;

import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class MenuButtons extends Button{

	public MenuButtons(String buttonText) {
		
		setText(buttonText);
		setPrefSize(250, 80);
        
	}

}
