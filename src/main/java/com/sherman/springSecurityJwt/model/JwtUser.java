package com.sherman.springSecurityJwt.model;

public class JwtUser {

    private String userName;
    private long id;
    private String role;

    public void setUserName(String userName) {
        this.userName = userName;
    }

	public void setId(long id) {
        this.id = id;
	}

	public void setRole(String role) {
        this.role = role;
    }

    public String getUserName() {
        return this.userName;
    }


    public long getId() {
        return this.id;
    }


    public String getRole() {
        return this.role;
    }

    
}
