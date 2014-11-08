package org.hibernate.tutorial.domain;

import java.util.Date;

public class Event {

    private long id;
    private String title;
    private Date date;

    public Event() {}

    public long getId() {
        return id;
    }
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
