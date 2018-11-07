import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;

/**
 * A class that converts Fahrenheit to Celsius in GUI window.
 * @author Ike Maldonado
 * @version 10/29/18
 *
 */
public class CelsiusToFahrenheit extends Application {
	// Main method must call static launch() from Application class.
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	// Fields
	private static String fahrenheit;
	private static double celsius;
	
	//This is where some changes
	//can happen!
	// Create Stage
	@Override public void start(Stage stage) {
		// Label below textField
		Label textLabel = new Label("From F°");
		// Label below Convert button
		Label answerLabel = new Label();
		// textField box
		TextField textField = new TextField();
		
		// Convert and Clear buttons
		Button convertButton = new Button("Convert");
		Button clearButton = new Button("Clear");
		
		// Establish GridPane object as root
		GridPane root = new GridPane();
		
		// Format GridPane 
		root.setPadding(new Insets(25));
		root.setHgap(15);
		root.setVgap(5);
	    root.setStyle("-fx-padding: 10;" +
	      "-fx-border-style: solid inside;" +
	      "-fx-border-width: 2;" +
	      "-fx-border-insets: 5;" +
	      "-fx-border-radius: 5;" +
	      "-fx-border-color: blue;");
	    
		// Format GridPane elements
		root.add(textLabel, 0, 1);
		root.add(textField, 0, 0);
		root.add(convertButton, 1, 0);
		root.add(clearButton, 2, 0);
		root.add(answerLabel, 1, 1);
		
		// Button that converts text in textField to degrees Celsius.
		convertButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override 
			public void handle(ActionEvent e) {
				// Puts text in textField into a string variable.
				String f = textField.getText();
				// Assign string to fahrenheit field.
				fahrenheit = f;
				// Convert fahrenheit field to Celsius
				converter();
				// Return Celsius field, convert back to string, and format.
				answerLabel.setText(String.format("%.2f", answer()) + " °C");
			}
		});
		
		// Button that clears previous entries and results.
		clearButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				// Clears textField.
				textField.clear();
				// Clears answerLabel.
				answerLabel.setText(null);
			}
		});
		
		// Create scene, and set dimensions.
		Scene scene = new Scene(root, 400,100);
		// Set Title of stage
		stage.setTitle("Celsius converter");
		// Set scene within Stage
		stage.setScene(scene);
		// Show the stage.
		stage.show();
	}


	/**
	 * Helper method converts fahrenheit field to a double, then places
	 * value of conversion into double celsius field.
	 */
	public static void converter() {
		celsius = (Double.parseDouble(fahrenheit)-32.00)*(5.00/9.00);
		}
	
	/**
	 * Helper method returns celsius field.
	 * @return celsius The value in celsius field.
	 */
	public static double answer() {
		return celsius;
	}
}
