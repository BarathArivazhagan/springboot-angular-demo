package com.barath.demo.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootRestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestDemoApplication.class, args);
	}
	
	@CrossOrigin
	@GetMapping("/api/users")
	public List<User> getUsers(){
		
		List<User> users = new ArrayList<>();
		users.add(new User("User1"));
		users.add(new User("User2"));
		users.add(new User("User3"));		
		
		return users;
	}
	
	protected class User {
		
		private String userName;
		

		public User(String userName) {
			super();
			this.userName = userName;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}
		
		
	}

}
