package com.nogstudio.tortuga.Models;

import java.util.Date;
import java.util.Objects;

public class UserModel {

    private String userName;
    private String password;
    private String email;
    private String id;
    private String phone;
    private String avatar;
    private int reports;
    private int favourPoints;
    private Date bornDate;
    private Date registerDate;

    public UserModel(){

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getReports() {
        return reports;
    }

    public void setReports(int reports) {
        this.reports = reports;
    }

    public int getFavourPoints() {
        return favourPoints;
    }

    public void setFavourPoints(int favourPoints) {
        this.favourPoints = favourPoints;
    }

    public Date getBornDate() {
        return bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserModel)) return false;
        UserModel userModel = (UserModel) o;
        return Objects.equals( getUserName(), userModel.getUserName() ) ||
                Objects.equals( getEmail(), userModel.getEmail() ) ||
                Objects.equals( getId(), userModel.getId() ) ||
                Objects.equals( getPhone(), userModel.getPhone() );
    }

    @Override
    public int hashCode() {

        return Objects.hash( getUserName(), getEmail(), getId(), getPhone() );
    }
}
