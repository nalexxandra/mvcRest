package com.cgm.app;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cgm.main.User;

@Controller
public class LoginController {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	@ResponseBody
	protected ModelAndView getLogin(Map model) throws Exception{
		User user = (User) model.get("user");
		
		if(user == null || user.getUsername() == null) {
			model.put("user", new User());
		}
		return new ModelAndView("login");
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	protected ModelAndView login(@ModelAttribute("user") User user, HttpServletRequest request){
		List<User> userList = User.getUsers();
		for(User u : userList) {
			if(user.getUsername().equals(u.getUsername()) && user.getPassword().equals(u.getPassword())) {
					request.getSession().setAttribute("LOGGEDIN_USER", user);
					return new ModelAndView("redirect:/login");
			}
		}
		Map model = new HashMap();
		model.put("message", "Username or Password wrong!");
		
		return new ModelAndView("login", model);
	}

}
