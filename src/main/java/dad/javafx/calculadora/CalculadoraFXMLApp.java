package dad.javafx.calculadora;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CalculadoraFXMLApp extends Application {

	private Controller controller;
	@Override
	public void start(Stage primaryStage) throws Exception {
		controller =new Controller();
		Scene scene= new Scene(controller.getRoot(),640,480);
		
		primaryStage.setTitle("CalculadoraFXML");
		primaryStage.setScene(scene);
		primaryStage.show();

	}
	public static void main(String[] args) {
		launch(args);
	}

}
