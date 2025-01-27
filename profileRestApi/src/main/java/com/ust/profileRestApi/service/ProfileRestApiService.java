package com.ust.profileRestApi.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.profileRestApi.entity.ProfileRestApiEntity;
import com.ust.profileRestApi.repository.ProfileRestApiRepo;

@Service
public class ProfileRestApiService {	
	
	@Autowired
	ProfileRestApiRepo profileRestApiRepo;
	
	public Optional<ProfileRestApiEntity> getProfileDataById(Long idValue) {
		System.out.println("##############ID AT SERVICE" +idValue);
		return profileRestApiRepo.findById(idValue);
	}
	
//	 private static final Map<String, ProfileRestApiEntity> profileDatabase = new HashMap<>();
//
//	    static {
//	        profileDatabase.put("101", new ProfileRestApiEntity("101", "Full Stack Developer", "I am a Java Developer", 
//	                "Received On the Spot Award", "8 years of Experience", "Dancing", "JAVA Spring Boot", 
//	                "Azure Angular Training 2025"));
//	        }
//
//	   
//	    public Optional<ProfileRestApiEntity> findById(String id) {
//	        return Optional.ofNullable(profileDatabase.get(id));
//	    }
}
	
