package com.event.finder;

import com.event.finder.controller.EventFinderController;
import com.event.finder.dto.request.EventFindByIdReq;
import com.event.finder.model.Event;
import com.event.finder.service.EventFinderService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.text.SimpleDateFormat;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(value = EventFinderController.class)
@EnableWebMvc
@AutoConfigureMockMvc
public class EventFinderControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @MockBean
    EventFinderService eventFinderService;

    @BeforeEach
    void setUp() {
        objectMapper = new ObjectMapper();
    }

    @Test
    public void findEventByIdTest() throws Exception {
        Event event = Event.builder().id("1").name("Musik").postalCode("14778")
                .place("Beetzseeheide").street("Altmarkt")
                .startDate(new SimpleDateFormat("yyyy-mm-dd").parse("2020-01-10"))
                .endDate(new SimpleDateFormat("yyyy-mm-dd").parse("2020-02-10"))
                .time("14:00").organizer("Carnica")
                .build();
        String expectedValue = objectMapper.writeValueAsString(event);
        EventFindByIdReq req = new EventFindByIdReq();
        req.setId("1");
        Mockito.when(eventFinderService.findById(req)).thenReturn(event);

        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/api/v1/findEventById/{id}", 1)
                .accept(MediaType.APPLICATION_JSON)
                .contentType(MediaType.APPLICATION_JSON);

        mockMvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().json(expectedValue));
    }
}
