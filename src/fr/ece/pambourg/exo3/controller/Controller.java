package fr.ece.pambourg.exo3.controller;

import fr.ece.pambourg.exo3.model.Model;
import fr.ece.pambourg.exo3.view.View;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;

public class Controller {
	
	@FXML private PieChart pieChartID;
	
	public void initialize() {
		
		Model si= new Model(13, "SI");
		Model se= new Model(25, "SE");
		Model ocrs= new Model(10, "OCRS");
		Model ee= new Model(10, "EE");
		Model iff= new Model(10, "IF");
		Model st= new Model(10, "ST");
		Model tm= new Model(10, "TM");
				
		ObservableList<PieChart.Data> pieChartData =
        FXCollections.observableArrayList(
        new PieChart.Data(si.getMajeur(), si.getNbStudent()),
        new PieChart.Data(se.getMajeur(), se.getNbStudent()),
        new PieChart.Data(ee.getMajeur(), ee.getNbStudent()),
        new PieChart.Data(iff.getMajeur(), iff.getNbStudent()),
        new PieChart.Data(st.getMajeur(), st.getNbStudent()),
        new PieChart.Data(tm.getMajeur(), tm.getNbStudent()),
        new PieChart.Data(ocrs.getMajeur(), ocrs.getNbStudent()));
		
		pieChartID.setData(pieChartData);
		pieChartID.setTitle("Nombre d'élève par majeur à l'ECE");		
	}
}
