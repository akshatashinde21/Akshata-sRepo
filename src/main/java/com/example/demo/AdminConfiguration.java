package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="myconfig")
public class AdminConfiguration {

	@Value("${myconfig.appname}")
	private String admin_name;
	private String adminuser;
	private String adminpass;
		
	
	public AdminConfiguration(String admin_name, String adminuser, String adminpass) {
		super();
		this.admin_name = admin_name;
		this.adminuser = adminuser;
		this.adminpass = adminpass;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public String getAdminuser() {
		return adminuser;
	}
	public void setAdminuser(String adminuser) {
		this.adminuser = adminuser;
	}
	public String getAdminpass() {
		return adminpass;
	}
	public void setAdminpass(String adminpass) {
		this.adminpass = adminpass;
	}
	
	
	
}
