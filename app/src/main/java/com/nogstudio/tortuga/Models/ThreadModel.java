package com.nogstudio.tortuga.Models;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class ThreadModel {

    private String title;
    private String id;
    private int reports;
    private Date creationDate;
    private UserModel author;
    private List<MsgModel> msgList;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public List<MsgModel> getMsgList() {
        return msgList;
    }

    public void setMsgList(List<MsgModel> msgList) {
        this.msgList = msgList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ThreadModel)) return false;
        ThreadModel that = (ThreadModel) o;
        return Objects.equals( getId(), that.getId() );
    }

    @Override
    public int hashCode() {

        return Objects.hash( getId() );
    }
}
