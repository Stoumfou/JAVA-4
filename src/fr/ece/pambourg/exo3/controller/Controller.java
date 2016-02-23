package fr.ece.pambourg.exo3.controller;

import fr.ece.pambourg.exo3.model.Model;
import fr.ece.pambourg.exo3.view.View;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;

public class Controller {
	
	private Model myModel;
	@FXML private PieChart myPieChart;
	
	
	public void initialize() {
		
		Model si= new Model(13, "SI");
		Model se= new Model(25, "SE");
		Model ocre= new Model(10, "OCRE");
		
		
		
	}
	
	
	public Model getMyModel() {
		return myModel;
	}
	public void setMyModel(Model myModel) {
		this.myModel = myModel;
	}
	public View getMyView() {
		return myView;
	}
	public void setMyView(View myView) {
		this.myView = myView;
	}
	public Controller(Model myModel, View myView) {
		super();
		this.myModel = myModel;
		this.myView = myView;
	}

}
