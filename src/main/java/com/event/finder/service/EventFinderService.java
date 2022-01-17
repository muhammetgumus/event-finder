package com.event.finder.service;

import com.event.finder.model.Event;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.Date;

public interface EventFinderService {
    Event findById(String id);
    Page<Event> allEvents(Pageable pageable);
    Page<Event> betweenStartAndEnd(Date startDate, Date endDate);
    Page<Event> findByPlace(String place);
    Page<Event> findByPostalCode(String postalCode);
    Page<Event> findByStreet(String street);
    Page<Event> findByName(String name);
    Page<Event> findByTime(String time);
    Page<Event> findByOrganizer(String organizer);
}
