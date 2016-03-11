package com.ashim.springmybatis.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ashim.springmybatis.service.PersonService;

@Controller
public class IndexController {

	@Autowired
	private PersonService personService;

	private final Logger logger = Logger.getLogger(this.getClass());

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public @ResponseBody Integer index() {
		try {
			personService.insert();
			return 1;
		} catch (Exception e) {
			logger.error(e);
		}
		return 0;
	}

}