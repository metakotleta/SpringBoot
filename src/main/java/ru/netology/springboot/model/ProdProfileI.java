package ru.netology.springboot.model;

public class ProdProfileI implements ISystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is production";
    }
}
