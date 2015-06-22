package com.sport.blog.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class RewardController {

	@RequestMapping(value="/reward" , method=RequestMethod.GET)
	public String reward(Model model){
		return "reward";
}
}