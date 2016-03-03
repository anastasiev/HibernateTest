package ua.study.dto;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Created by dmytro on 01.03.16.
 */
@Embeddable
public class Address {
    @Column(name="STREET_NAME")
    private String street;
    @Column(name="CITY_NAME")
    private String city;
    @Column(name="PIN_CODE")
    private String pincode;
    @Column(name="STATE_NAME")
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }




}
