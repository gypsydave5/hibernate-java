package org.hibernate.tutorial.domain;

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

}

