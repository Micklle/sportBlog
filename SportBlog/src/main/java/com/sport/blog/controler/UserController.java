package com.sport.blog.controler;

import java.util.Locale;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sport.blog.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Inject
	private UserService userService;

	
	@RequestMapping(method = RequestMethod.GET)
	public String getUsers(Model model) {

		model.addAttribute("users", userService.getAllUsers());

		return "user/user";
	}

	@RequestMapping(value="/login" , method=RequestMethod.GET)
	public String login(Model model){
		return "user/login";
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String getUserById(Model model, @PathVariable Integer id) {

		model.addAttribute("userInfo", userService.getUserInfo(id));

		return "user";
	}


	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String createUser(@RequestParam String email, @RequestParam String userName, @RequestParam String password) {

		userService.saveUser(userName, password);

		return "redirect:/users";
	}

}
