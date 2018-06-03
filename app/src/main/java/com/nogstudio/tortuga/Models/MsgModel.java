package com.nogstudio.tortuga.Models;

import java.util.Date;
import java.util.Objects;

public class MsgModel {

    private String text;
    private String id;
    private int reports;
    private Date creationDate;
    private UserModel author;

    public MsgModel(){

    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getReports() {
        return reports;
    }

    public void setReports(int reports) {
        this.reports = reports;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public UserModel getAuthor() {
        return author;
    }

    public void setAuthor(UserModel author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MsgModel)) return false;
        MsgModel msgModel = (MsgModel) o;
        return Objects.equals( getId(), msgModel.getId() );
    }

    @Override
    public int hashCode() {

        return Objects.hash( getId() );
    }
}
