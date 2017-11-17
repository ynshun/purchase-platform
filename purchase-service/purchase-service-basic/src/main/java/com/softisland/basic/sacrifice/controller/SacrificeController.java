package com.softisland.basic.sacrifice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SacrificeController {

	@RequestMapping(value = "/daiji", method = RequestMethod.GET)
	public ModelAndView toSacrifice() {
		ModelAndView modelAndView = new ModelAndView("main/sacrifice");
		return modelAndView;
	}
}
