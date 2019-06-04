package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {

	private int id;
	private String name;
	
	public void sendmail()
	{
		System.out.println("NotificationSrvice");
	}

	@Override
	public String toString() {
		return "NotificationService [id=" + id + ", name=" + name + "]";
	}

	
	
	
}
