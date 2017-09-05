package com.cgm.main;

import java.util.ArrayList;
import java.util.List;

public class Message {
	private String txt;

	public String getTxt() {
		return txt;
	}

	public void setTxt(String txt) {
		this.txt = txt;
	}
	
	
	public static List<String> getMessages(){
		List<User> users = User.getUsers();
		List<String> messages = new ArrayList<String>();
		for(User u: users) {
			messages.addAll(u.getMessages());
		}
		return messages;
	}
	
}
