package com.cgm.app;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cgm.main.Message;

@Controller
public class NewMessageController {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value = "/newmessage", method = RequestMethod.GET)
	protected ModelAndView getMessage(Map model) throws Exception {
		Message message = (Message) model.get("newmessage");
		if(message == null || message.getTxt() == null) {
			model.put("newmessage", new Message());
		}
		return new ModelAndView("newmessage", model);
	}
	
}
