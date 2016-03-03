package ua.study.dto;

import javax.persistence.Embeddable;

/**
 * Created by dmytro on 01.03.16.
 */
@Embeddable
public class Address {
    private String strit;
    private String city;
    private String pincode;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStrit() {
        return strit;
    }

    public void setStrit(String strit) {
        this.strit = strit;
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

    private String state;


}
