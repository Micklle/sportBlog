package com.sport.blog.controler;

import java.security.Principal;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.sport.blog.dto.UserDto;
import com.sport.blog.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {

	@Inject
	private UserService userService;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView getUsers(ModelAndView model) {
		model.addObject("allUserList", userService.getAllUsers());
		model.setViewName("users");
		return model;
	}

	@RequestMapping(value = "/show", method = RequestMethod.GET)
	public @ResponseBody List<UserDto> showUser() {
		List<UserDto> users = userService.getUsers();
		return users;
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String getUser(Model model) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String name = auth.getName(); // get logged in username
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
	
	@RequestMapping(value = "upload-photo", method = RequestMethod.POST)
	public String addUserPhoto(@RequestParam("photo") MultipartFile photo,
			Principal principal, HttpServletRequest request) {

		userService.addPhoto(principal.getName(), photo,
				request.getServletContext().getRealPath(""));
		return "redirect:/users/user";
	}
}
