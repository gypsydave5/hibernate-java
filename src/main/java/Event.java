package org.hibernate.tutorial.domain;

import java.util.Date;

public class Event {

    private long id;
    private String title;
    private Date date;

    public Event() {} //empty constructor for Hibernate

    public long getId() {
        return id;
    }
    // setId can be private; Hibernate uses reflection to get inside the object
    // to set the id
    public void setId(long newId) {
        id = newId;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String newTitle) {
        title = newTitle;
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date newDate) {
        date = newDate;
    }

}
