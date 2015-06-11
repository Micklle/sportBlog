package com.sport.blog.controler;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String getPosts(Model model) {

		model.addAttribute("posts", postservice.getAllPosts());
		return "posts";

	}

	@RequestMapping(value = "/createPost", method = RequestMethod.POST)
	public String createPost(@RequestParam String text, @RequestParam String title) {

		postservice.savePost(text, title);

		return "posts";
	}
}
