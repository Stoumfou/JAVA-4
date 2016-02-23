package fr.ece.pambourg.model;

import java.util.ArrayList;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class UserList extends java.util.Observable {
	
	private List<String> userList = new ArrayList<String>();
	
	public UserList() {
		super();
	}

	public List<String> getUserList() {
		return userList;
	}

	public void setUserList(List<String> userList) {
		this.userList = userList;
	}

	public boolean addUser(String user)
	{
		if (user == null)
		{
			return false;
		}
		else
		{
			this.userList.add(user);
			this.setChanged();
			this.notifyObservers();
			return true;
		}
	}

	public ObservableList<String> getData() {
		ObservableList<String> res= FXCollections.observableArrayList(this.userList);
		return res;
	}

}
