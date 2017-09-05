package com.cgm.app;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cgm.main.Message;
import com.cgm.main.User;

@RestController
public class RESTController {

	@RequestMapping(value = "/friends/{id}", method = RequestMethod.GET)
	protected User getUser(@PathVariable int id) throws Exception {
		return User.getUsers().get(id);
	}
	
	@RequestMapping(value = "/messages", method = RequestMethod.GET)
	protected ArrayList<String> getMessages() throws Exception{
		return (ArrayList<String>) Message.getMessages();
	}
	
	@RequestMapping(value = "/message", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public User postMessage(@RequestBody String content, HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("LOGGEDIN_USER");
		System.out.println(user.getUsername() + " --- " + content);
		return user;
	}

}
