package com.exam.idcard.model;

public class ProfileBuilder {

    public static Profile buildDefaultStudentProfile() {
        Profile profile = new Profile();
        profile.setFullName("Default Student");
        profile.setOrganization("ITC");
        profile.setPosition("Student");
        profile.setPhone("000000000");
        profile.setEmail("student@example.com");
        profile.setAddress("Phnom Penh");
        profile.setProfileType(ProfileType.STUDENT);
        profile.setBarcodeType(BarcodeType.CODE_128);
        profile.setBarcodeValue("STUDENT-001");
        return profile;
    }
}