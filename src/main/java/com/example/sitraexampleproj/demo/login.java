package com.example.sitraexampleproj.demo;

public class login {
    private Long phone;
    private String password;
    public login(Long phone , String password){
        this.phone = phone;
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return phone + " " + password;
    }
}
