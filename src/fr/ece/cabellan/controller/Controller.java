package fr.ece.cabellan.controller;


import fr.ece.pambourg.model.UserList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Controller  {
	private UserList userList = new UserList();
	@FXML private ListView<String> myList;
	@FXML private TextField inputList;
	
	@FXML
	public void setList() {
		userList.addUser(inputList.getText());
		myList.setItems(userList.getData()); 
	}
	
}
