package com.sport.blog.controler;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sport.blog.service.RewardService;


@Controller
@RequestMapping("/reward")
public class RewardController {

		@Inject
		private RewardService rewardService;

		@RequestMapping(method = RequestMethod.GET)
		public ModelAndView getUsers(ModelAndView model) {
			model.addObject("reward", rewardService.getAllReward());
			model.setViewName("reward");
			return model;
		}

}