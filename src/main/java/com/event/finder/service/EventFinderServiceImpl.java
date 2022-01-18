package com.event.finder.service;

import com.event.finder.model.Event;
import com.event.finder.repository.EventFinderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class EventFinderServiceImpl implements EventFinderService {

    public static Event event= Event.builder().build();

    @Autowired
    EventFinderRepository eventFinderRepository;

    @Override
    public Event findById(String id) {
        return eventFinderRepository.findById(id).orElse(event);
    }

    @Override
    public Page<Event> allEvents(Pageable pageable) {
        return eventFinderRepository.findAll(pageable);
    }

    @Override
    public Page<Event> betweenStartAndEnd(Date startDate, Date endDate) {
        return eventFinderRepository
                .findAllByStartDateLessThanEqualAndEndDateGreaterThanEqual(startDate,endDate);
    }

    @Override
    public Page<Event> findByPlace(String place) {
        return eventFinderRepository.findByPlace(place);
    }

    @Override
    public Page<Event> findByPostalCode(String postalCode) {
        return eventFinderRepository.findByPostalCode(postalCode);
    }

    @Override
    public Page<Event> findByStreet(String street) {
        return eventFinderRepository.findByStreet(street);
    }

    @Override
    public Page<Event> findByName(String name) {
        return eventFinderRepository.findByName(name);
    }

    @Override
    public Page<Event> findByTime(String time) {
        return eventFinderRepository.findByTime(time);
    }

    @Override
    public Page<Event> findByOrganizer(String organizer) {
        return eventFinderRepository.findByOrganizer(organizer);
    }
}
