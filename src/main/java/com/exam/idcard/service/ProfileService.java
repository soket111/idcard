package com.exam.idcard.service;

import com.exam.idcard.model.Profile;
import com.exam.idcard.repository.ProfileRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService {

    private final ProfileRepository profileRepository;

    public ProfileService(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    public List<Profile> getAllProfiles() {
        return profileRepository.findAll();
    }

    public Profile getProfileById(Long id) {
        return profileRepository.findById(id).orElse(null);
    }

    public Profile createProfile(Profile profile) {
        return profileRepository.save(profile);
    }

    public Profile updateProfile(Long id, Profile profileDetails) {
        Profile profile = profileRepository.findById(id).orElse(null);

        if (profile == null) {
            return null;
        }

        profile.setFullName(profileDetails.getFullName());
        profile.setOrganization(profileDetails.getOrganization());
        profile.setPosition(profileDetails.getPosition());
        profile.setPhone(profileDetails.getPhone());
        profile.setEmail(profileDetails.getEmail());
        profile.setAddress(profileDetails.getAddress());
        profile.setProfileType(profileDetails.getProfileType());
        profile.setBarcodeType(profileDetails.getBarcodeType());
        profile.setBarcodeValue(profileDetails.getBarcodeValue());

        return profileRepository.save(profile);
    }

    public void deleteProfile(Long id) {
        profileRepository.deleteById(id);
    }
}