package fr.ece.pambourg.exo3.controller;

import fr.ece.pambourg.exo3.model.Model;
import fr.ece.pambourg.exo3.view.View;
import javafx.fxml.FXML;

public class Controller {
	
	private Model myModel;
	@FXML private View myView;
	
	
	
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
