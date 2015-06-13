package com.sport.blog.controler;

import javax.inject.Inject;
import javax.transaction.Transactional;

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
		model.addObject("allUserList", userService.getAllUsers());
//		model.addObject("userList", userService.getUserByRoleId(2));
//		model.addObject("adminList", userService.getUserByRoleId(1));
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
			@RequestParam String userName, @RequestParam String password) {

		userService.saveUser(userName, email, password);

		return "redirect:/users";
		
	}

}
