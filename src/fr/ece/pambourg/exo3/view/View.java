package fr.ece.pambourg.exo3.view;

import fr.ece.pambourg.exo3.model.Model;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;

public class View extends Application {
	
	public static void main ( String [] args ) {
		launch ( args );
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		Model si= new Model(13, "SI");
		Model se= new Model(25, "SE");
		Model ocre= new Model(10, "OCRE");
		
        Scene scene = new Scene(new Group());
        stage.setTitle("TP4 JavaFX Exo 3");
        stage.setWidth(500);
        stage.setHeight(500);
        
        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                new PieChart.Data(si.getMajeur(), si.getNbStudent()),
                new PieChart.Data(se.getMajeur(), se.getNbStudent()),
                new PieChart.Data(ocre.getMajeur(), ocre.getNbStudent()));
        final PieChart chart = new PieChart(pieChartData);
        chart.setTitle("Nombre d'élève par majeur à l'ECE");
        ((Group) scene.getRoot()).getChildren().add(chart);        
        stage.setScene(scene);
        stage.show();
	}
}
