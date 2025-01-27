package com.ust.profileRestApi.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.profileRestApi.entity.ProfileRestApiEntity;
import com.ust.profileRestApi.service.ProfileRestApiService;

@RestController
@RequestMapping("/api/profile")
public class ProfileRestApiController {
	
	@Autowired
	ProfileRestApiService  profileRestApiService;
	
	@GetMapping("/{id}")
	public Optional<ProfileRestApiEntity> getProfileDetailsById(@PathVariable("id") Long idValue) {	 
		System.out.println("####################"+ idValue);
		Optional<ProfileRestApiEntity> profileData = profileRestApiService.getProfileDataById(idValue);
		return profileData;	
	}

}
