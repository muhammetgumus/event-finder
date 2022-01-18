package com.event.finder.service;

import com.event.finder.model.Event;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class EventFinderServiceImpl implements EventFinderService {
    @Override
    public Event findById(String id) {
        return null;
    }

    @Override
    public Page<Event> allEvents(Pageable pageable) {
        return null;
    }

    @Override
    public Page<Event> betweenStartAndEnd(Date startDate, Date endDate) {
        return null;
    }

    @Override
    public Page<Event> findByPlace(String place) {
        return null;
    }

    @Override
    public Page<Event> findByPostalCode(String postalCode) {
        return null;
    }

    @Override
    public Page<Event> findByStreet(String street) {
        return null;
    }

    @Override
    public Page<Event> findByName(String name) {
        return null;
    }

    @Override
    public Page<Event> findByTime(String time) {
        return null;
    }

    @Override
    public Page<Event> findByOrganizer(String organizer) {
        return null;
    }
}
