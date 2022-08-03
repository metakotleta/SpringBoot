package ru.netology.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.springboot.model.ISystemProfile;

@RestController
public class ProfileController {
    private ISystemProfile profile;

    public ProfileController(ISystemProfile profile) {
        this.profile = profile;
    }

    @GetMapping("profile")
    public String getProfile() {
        return profile.getProfile();
    }
}
