package ru.netology.springboot.model;

public class DevProfileI implements ISystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is dev";
    }
}
