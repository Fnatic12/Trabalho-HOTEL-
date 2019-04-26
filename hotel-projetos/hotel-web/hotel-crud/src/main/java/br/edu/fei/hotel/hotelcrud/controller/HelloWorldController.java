package br.edu.fei.hotel.hotelcrud.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/helloWorld")
public class HelloWorldController
{
	@RequestMapping(value = "/open", method = RequestMethod.GET, produces = "application/json")
	public static final String open(final HttpServletRequest request)
	{
		return "Layout/layout";
	}
}