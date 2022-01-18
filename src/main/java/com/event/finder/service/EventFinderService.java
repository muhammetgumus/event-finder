package com.event.finder.service;

import com.event.finder.dto.request.*;
import com.event.finder.model.Event;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.Date;

public interface EventFinderService {
    Event findById(EventFindByIdReq req);
    Page<Event> allEvents(EventAllReq request);
    Page<Event> betweenStartAndEnd(EventFindByDateBetweenReq request);
    Page<Event> findByPlace(EventFindByPlaceReq request);
    Page<Event> findByPostalCode(EventFindByPostalCodeReq request);
    Page<Event> findByStreet(EventFindByStreetReq request);
    Page<Event> findByName(EventFindByNameReq name);
    Page<Event> findByTime(EventFindByTimeReq request);
    Page<Event> findByOrganizer(EventFindByOrganizerReq request);
}
