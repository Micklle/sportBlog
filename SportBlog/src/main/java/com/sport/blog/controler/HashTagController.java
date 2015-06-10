package com.sport.blog.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sport.blog.service.HashtagService;

@Controller
@RequestMapping("/hashtags")
public class HashTagController {
	private HashtagService hashtagservice;

	@RequestMapping(method = RequestMethod.GET)
	public String getHashTags(Model model) {
		model.addAttribute("hashtags", hashtagservice.getAllHashTags());

		return "hashtags";

	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String createHashTag(@RequestParam String name) {

		hashtagservice.saveHashTag(name);

		return "redirect:/users";
	}
}
