package com.cgm.main;

import java.util.ArrayList;
import java.util.List;



public class User {

	private String username;
	private String password;
	private String email;
	private List<String> friends;
	private List<String> messages;
	
	public User() {
		
	}
	public User(String u, String p, String e) {
		username = u;
		password = p;
		email = e;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public List<String> getMessages() {
		return messages;
	}
	public void setMessages(List<String> messages) {
		this.messages = messages;
	}
	
	public void addMessages(String message) {
		
		this.messages.add(message);
	}
	
	
	
	public static List<User> getUsers() {
		List<String> friends = new ArrayList<String>();
		List<String> messages = new ArrayList<String>();
		
		List<User> users = new ArrayList<User>();

		users.add(new User("user1", "123", "user1@yahoo.com"));
		users.add(new User("user2", "123", "user2@gmail.com"));
		users.add(new User("user3", "123", "user3@hotmail.com"));
		users.add(new User("user4", "123", "user4@hotmail.com"));
		users.add(new User("user5", "123", "user5@ceva.ro"));
		
		
		friends.add("user1");
		friends.add("user2");
		friends.add("user3");
		friends.add("user4");
		friends.add("user5");
		users.get(0).setFriends(friends.subList(0, 3));
		users.get(1).setFriends(friends.subList(1, 3));
		users.get(2).setFriends(friends.subList(2, 5));
		users.get(3).setFriends(friends);
		users.get(4).setFriends(friends);
		
		messages.add("Message 1 for user 1");
		messages.add("Message 2 for user 1");
		messages.add("Message 3 for user 1");
		messages.add("Message 4 for user 1");
		messages.add("Message 1 for user 2");
		messages.add("Message 1 for user 3");
		messages.add("Message 2 for user 3");
		messages.add("Message 3 for user 3");
		messages.add("Message 1 for user 4");
		messages.add("Message 1 for user 5");
		messages.add("Message 2 for user 5");
		users.get(0).setMessages(messages.subList(0, 4));
		users.get(1).setMessages(messages.subList(4, 5));
		users.get(2).setMessages(messages.subList(5, 8));
		users.get(3).setMessages(messages.subList(8, 9));
		users.get(4).setMessages(messages.subList(9, 11));
		
		return users;
	}

	
}
