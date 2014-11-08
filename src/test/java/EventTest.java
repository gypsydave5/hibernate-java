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
        event.setId(55);
        assertThat(event.id(), is(55));
    }

}

