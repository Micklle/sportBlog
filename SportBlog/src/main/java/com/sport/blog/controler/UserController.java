package com.sport.blog.controler;


import javax.inject.Inject;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sport.blog.model.User;
import com.sport.blog.service.UserService;
import com.sport.blog.service.impl.UserDetailsServiceImpl;

@Controller
@RequestMapping("/users")
public class UserController {

	@Inject
	private UserService userService;
	@Inject
	private UserDetailsServiceImpl userDetailsServiceImpl;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView getUsers(ModelAndView model) {
		model.addObject("allUserList", userService.getAllUsers());
		model.setViewName("users");
		return model;
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String getUser(Model model) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	      String name = auth.getName(); //get logged in username
	      model.addAttribute("username", name);
		return "user";
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String getUserById(Model model, @PathVariable Integer id) {
		model.addAttribute("userInfo", userService.getUserInfo(id));
		return "user";
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String createUser(@RequestParam String email, @RequestParam String userName, @RequestParam String password) {
		userService.saveUser(userName, email, password);
		return "redirect:/users";

	}
}
