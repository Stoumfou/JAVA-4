package fr.ece.pambourg.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class newGUI extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("View.fxml"));
        Scene scene = new Scene(root, 300, 275);
       
        stage.setTitle("JavaFX");
        stage.setScene(scene);
        stage.show();
	}
}
