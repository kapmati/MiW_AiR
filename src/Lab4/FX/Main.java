package Lab4.FX;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("Lab4/FX/GuiDesign.fxml"));
        primaryStage.setTitle("Metody inżynierii wiedzy - Associative Graph Data Structure vs Table");
        primaryStage.setScene(new Scene(root, 1200, 550));
		primaryStage.setResizable(false);
        primaryStage.show();
	}
}