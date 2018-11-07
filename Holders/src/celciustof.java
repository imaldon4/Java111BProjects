import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;

public class CelsiusToFahrenheit extends Application {
	//Using main method, so I need to call a launch() static
	//method from the Application class
	
	private String fahrenheit;
	private String celsius;
	

	
	Label degreeLabel = new Label("Fahrenheit");
	
	@Override public void start(Stage stage) throws Exception {
		stage.setTitle("Celsius converter");
        
		GridPane root = new GridPane();
		root.setPadding(new Insets(20));
		root.setHgap(25);
		root.setVgap(15);
		
        //TextField
        TextField textField = new TextField("Degrees");
        degreeLabel.setLabelFor(textField);
        textField.setPrefSize(100,25);
        root.getChildren().add(textField);
        
        
        //Button 1
        Button button1 = new Button("Celsius");
        button1.setPrefSize(100, 25);
        root.getChildren().add(button1);
        
        //Button 2
        Button button2 = new Button("Fahrenheit");
        button2.setPrefSize(100, 25);
        root.getChildren().add(button2);
        
        //Button 3
        Button button3 = new Button("Kelvin");
        button3.setPrefSize(100, 25);
        root.getChildren().add(button3);
        
        //Button 4
        Button button4 = new Button("Clear");
        button4.setPrefSize(100, 25);
        root.getChildren().add(button4);
        
        root.add(degreeLabel, 0, 1);
        root.add(textField, 1, 1);
        root.add(button1, 2, 1);


//        root.setStyle("-fx-padding: 10;" +
//                "-fx-border-style: solid inside;" +
//                "-fx-border-width: 2;" +
//                "-fx-border-insets: 5;" +
//                "-fx-border-radius: 5;" +
//                "-fx-border-color: blue;");
		
		Scene scene = new Scene(root);
		stage.setScene(scene);

		//Set properties of the Stage
		stage.setX(750);
		stage.setY(500);
		stage.setMinHeight(200);
		stage.setMinWidth(400);
		stage.show();
	}

	public void getCelsius() {
		celsius = Double.toString((Double.parseDouble(this.fahrenheit) - 32)*(5/9));
	}
	
	public void printMessage(String string) {
		lbl.setText(string);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
