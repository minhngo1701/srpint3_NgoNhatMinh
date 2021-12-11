package com.example.webcafe.jwt_token;
import java.util.List;

//Kiet login 23/10 this class use to response data(token, username, role) for angular which save on localStorage
public class ResponseToken {
    private String token;
    private String username;
    private List<String> roles;

    public ResponseToken(String token, String username, List<String> roles) {
        this.token = token;
        this.username = username;
        this.roles = roles;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
}
