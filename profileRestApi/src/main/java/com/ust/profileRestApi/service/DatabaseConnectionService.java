package com.ust.profileRestApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class DatabaseConnectionService {

	  @Autowired
	    private JdbcTemplate jdbcTemplate;

	    public void testConnection() {
	        String query = "SELECT 1";  // Simple test query
	        try {
	            Integer result = jdbcTemplate.queryForObject(query, Integer.class);
	            System.out.println("Database Connection Test: " + (result != null ? "Success" : "Failed"));
	        } catch (Exception e) {
	            System.out.println("Database Connection Test: Failed");
	            e.printStackTrace();
	        }
	    }
	}

