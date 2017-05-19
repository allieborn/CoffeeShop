package com.GrandCircus;

//import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;


public class Customer {

    @NotNull
    private String name;
    private String email;
    private String phone;

    public String getTimeVisit() {
        return timeVisit;
    }

    public void setTimeVisit(String timeVisit) {
        this.timeVisit = timeVisit;
    }

    private String timeVisit;

    public String getFavItem() {
        return favItem;
    }

    public void setFavItem(String favItem) {
        this.favItem = favItem;
    }

    private String favItem;

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private String city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setId(String phone) {
        this.phone = phone;
    }
}
