package com.oriensolutions.ramonaas.model;

public class User {

    private String fname;
    private String lname;
    private String email;
    private String profile_image_id;
    private String name;

    public User() {
    }

    public User(String fname, String lname, String email, String profile_image_id, String name) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.profile_image_id = profile_image_id;
        this.name = name;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfile_image_id() {
        return profile_image_id;
    }

    public void setProfile_image_id(String profile_image_id) {
        this.profile_image_id = profile_image_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
