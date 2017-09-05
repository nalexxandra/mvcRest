package com.cgm.app;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cgm.main.User;

@Controller
public class FriendsController {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value = "/friends", method = RequestMethod.GET)
	protected @ResponseBody ModelAndView getUsers() throws Exception {
			Map model = new HashMap();
			model.put("users", User.getUsers());
			return new ModelAndView("friends", model);
	}
	
    @RequestMapping(value = {"/about", ""})
    public String viewStats(Map<String, Object> model) {
        return "about";
    }
}
