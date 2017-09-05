package com.cgm.app;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cgm.main.User;

@Controller
public class MyfriendController {

	@SuppressWarnings({"unchecked", "rawtypes"})
	@RequestMapping(value = "/myfriend", method = RequestMethod.GET)
	@ResponseBody
	protected ModelAndView getMyFriend(HttpServletRequest request) throws Exception{
		User user = (User)request.getSession().getAttribute("LOGGEDIN_USER");
		List<User> users = User.getUsers();
		if(user != null) {
			Map model = new HashMap();
			model.put("username", user.getUsername());
			for(User u : users) {
				if(u.getUsername().equals(user.getUsername())) {
					model.put("messages", u.getMessages());
					model.put("friends", u.getFriends());
				}
			}
			return new ModelAndView("myfriend", model);
		} else {
			return new ModelAndView("myfriend");
		}
	}
	
}
