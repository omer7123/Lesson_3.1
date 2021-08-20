package com.ripalay.lesson_31;

public class Country {
    private int flag;
    private String country;
    private String city;


    public Country(int flag, String country, String city) {
        this.flag = flag;
        this.country = country;
        this.city = city;
    }


    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
