package com.cgm.app;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cgm.main.User;

@RestController
public class SearchController {

	
	@RequestMapping(value = "/search", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ModelAndView findUser(@RequestBody String content) {
		ArrayList<User> users = (ArrayList<User>)User.getUsers();
		
		String user = content.substring(1, content.length() - 1); //?
		
		for(User u : users) {
			if(user.equals(u.getUsername())) {
				System.out.println("found " + content);
				return new ModelAndView("redirect:/friends/"+content);
			}
		}
		System.out.println( "not found " + content);
		return new ModelAndView("redirect:/friends");
	}
}
