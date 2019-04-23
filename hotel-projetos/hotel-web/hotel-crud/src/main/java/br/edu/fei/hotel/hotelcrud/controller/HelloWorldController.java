package br.edu.fei.hotel.hotelcrud.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/helloWorld")
public class HelloWorldController
{
	@RequestMapping(value = "/open", method = RequestMethod.GET, produces = "application/json")
	public static final ResponseEntity<String> open(final HttpServletRequest request)
	{
		return ResponseEntity.ok("Vitão - FEI");
	}
}