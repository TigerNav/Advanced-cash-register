module Test {
	requires javafx.controls;
	requires javafx.graphics;
	requires java.sql;
	requires javafx.base;
	
	opens produce_check to javafx.graphics, javafx.fxml;
	opens employees_check to javafx.graphics, javafx.fxml;
}
