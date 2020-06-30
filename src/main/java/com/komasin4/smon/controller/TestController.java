package com.komasin4.smon.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.komasin4.smon.dao.TestDao;

@Controller
public class TestController {
	
	@Autowired
	private TestDao testDao;

	@ResponseBody
	@GetMapping(path = "/hello")
	public String helloWorld() {
		return LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
	}	

	@ResponseBody
	@GetMapping(path = "/dbtest")
	public String dbTest() {
		return testDao.selectTest();
	}	
	
}
