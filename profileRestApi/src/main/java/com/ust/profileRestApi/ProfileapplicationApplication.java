package com.ust.profileRestApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ust.profileRestApi.service.DatabaseConnectionService;

@SpringBootApplication
public class ProfileapplicationApplication implements CommandLineRunner {
	
	@Autowired
    private DatabaseConnectionService databaseConnectionService;

	public static void main(String[] args) {
		SpringApplication.run(ProfileapplicationApplication.class, args);
	}

	
	 @Override
	    public void run(String... args) throws Exception {
	        databaseConnectionService.testConnection();
	    }
}
