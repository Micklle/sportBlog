package com.sport.blog.controler;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sport.blog.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {

	@Inject
	private UserService userService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView getUsers(ModelAndView model) {
		model.addObject("usersList", userService.getAllUsers());
		model.setViewName("users");
		return model;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String getUserById(Model model, @PathVariable Integer id) {
		model.addAttribute("userInfo", userService.getUserInfo(id));
		return "user";
	}


	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String createUser(@RequestParam String email,
			@RequestParam String name, @RequestParam String pwd) {

		userService.saveUser(name, email, pwd);

		return "users";
		
	}

}
