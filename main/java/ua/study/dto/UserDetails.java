package ua.study.dto;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by dmytro on 24.02.16.
 */
@Entity
@Table(name = "USER_DETAILS")
public class UserDetails {
    @Id
    @GeneratedValue //autoincrement
    private int userId;
    private String userName;
    @Temporal(TemporalType.DATE)
    private Date joinDate;
    @Lob //long object, longtext or bytestream in db
    private String description;

    @Embedded
    private Address address;

    @Transient
    private int transietField;

    public int getTransietField() {
        return transietField;
    }

    public void setTransietField(int transietField) {
        this.transietField = transietField;
    }


    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
