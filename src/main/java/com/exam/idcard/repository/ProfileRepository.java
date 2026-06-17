package com.exam.idcard.repository;

import com.exam.idcard.model.Profile;
import com.exam.idcard.model.ProfileType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProfileRepository extends JpaRepository<Profile, Long> {

    List<Profile> findByFullNameContainingIgnoreCase(String fullName);

    List<Profile> findByProfileType(ProfileType profileType);

    boolean existsByEmail(String email);
}