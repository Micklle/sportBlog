package com.sport.blog.controler;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sport.blog.service.PostService;

@Controller
@RequestMapping("/posts")
public class PostController {
	
	@Inject
	private PostService postservice;

	@RequestMapping(method = RequestMethod.GET)
	public String getPostsByTitle(Model model, @PathVariable String title) {

		model.addAttribute("posts", postservice.getPostByTitle(title));
		return "posts";

	}

	@RequestMapping(method = RequestMethod.GET)
	public String getPostsByText(Model model,  @PathVariable String text) {

		model.addAttribute("posts", postservice.getPostByText(text));
		return "posts";
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String createPost(@RequestParam String text,
			@RequestParam String title) {

		postservice.savePost(text, title);

		return "posts";
	}
}
