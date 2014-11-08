package org.hibernate.tutorial.domain;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class EventTest {

    public Event event;

    @Before
    public void setUp() {
        event = new Event();
    }

    @Test
    public void canSetAndGetId() {
        event.setId(55L);
        assertThat(event.getId(), is(55L));
    }

    @Test
    public void canSetAndGetTitle() {
        event.setTitle("Title");
        assertThat(event.getTitle(), is("Title"));
    }

    @Test
    public void canSetAndGetDate() {
        Calendar timeNow = Calendar.getInstance();
        Date today = timeNow.getTime();
        event.setDate(today);
        assertThat(event.getDate(), is(today));
    }
}

