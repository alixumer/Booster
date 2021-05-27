package com.boosterfueldeliveryservices.models;

public class FirebaseMarker {

    public String dob;
    public String dod;
    public String firstname;
    public String lastname;
    public double latitude;
    public double longitude;


    //required empty constructor
    public FirebaseMarker() {
    }

    public FirebaseMarker(String firstname, String lastname, double latitude, double longitude, String dob, String dod) {
        this.dob = dob;
        this.dod = dod;
        this.firstname = firstname;
        this.lastname = lastname;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDod() {
        return dod;
    }

    public void setDod(String dod) {
        this.dod = dod;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
}