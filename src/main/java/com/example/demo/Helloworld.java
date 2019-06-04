package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {

	@Autowired
	private NotificationService service;
	
	@Autowired
	private User adminuser;
	
	/*@Value("${app.name}")
	private String appname;*/
	
	/*@GetMapping("/")
	public String gethello()
	{
		return "Hello world";
	}*/
	
	@GetMapping("/")
	public String getNotservice()
	{
		return service.toString();
	}
	
	/*@GetMapping("/")
	public String getuser()
	{
		return adminuser.toString();
	}
	*/
	
	
}
