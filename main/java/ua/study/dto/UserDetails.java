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
    @AttributeOverrides({
            @AttributeOverride(name="street", column = @Column(name="HOME_STREET_NAME")),
            @AttributeOverride(name="city", column = @Column(name="HOME_CITY_NAME")),
            @AttributeOverride(name="state", column = @Column(name="HOME_STATE_NAME")),
            @AttributeOverride(name="pincode", column = @Column(name="HOME_PIN_CODE"))
    })
    private Address homeAddress;

    @Embedded
    private Address officeAddress;

    public Address getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(Address officeAddress) {
        this.officeAddress = officeAddress;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }



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
