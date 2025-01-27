package com.ust.profileRestApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ust.profileRestApi.entity.ProfileRestApiEntity;

@Repository
public interface ProfileRestApiRepo extends JpaRepository<ProfileRestApiEntity, Long> {
}
