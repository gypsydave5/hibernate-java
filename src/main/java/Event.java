package org.hibernate.tutorial.domain;

import java.util.Date;

public class Event {

    private long id;
    private String title;

    public Event() {}

    public long getId() {
        return id;
    }
    public void setId(long new_id) {
        id = new_id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String new_title) {
        title = new_title;
    }

}
