package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/pankaj")
public class DemoController {

	@RequestMapping("/get")
	public String get() {
		return "pankaj";
	}

}