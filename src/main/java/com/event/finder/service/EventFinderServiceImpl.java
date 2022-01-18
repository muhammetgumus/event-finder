package com.event.finder.service;

import com.event.finder.dto.request.*;
import com.event.finder.model.Event;
import com.event.finder.repository.EventFinderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventFinderServiceImpl implements EventFinderService {

    public static Event event= Event.builder().build();

    @Autowired
    EventFinderRepository eventFinderRepository;

    @Override
    public Event findById(EventFindByIdReq request) {
        return eventFinderRepository.findById(request.getId()).orElse(event);
    }

    @Override
    public Page<Event> allEvents(EventAllReq request) {
        return eventFinderRepository.findAll(getPageAbleInfo(request));
    }

    @Override
    public Page<Event> findByPlace(EventFindByPlaceReq request) {
        return eventFinderRepository.findByPlace(request.getPlace(), getPageAbleInfo(request));
    }

    @Override
    public Page<Event> findByPostalCode(EventFindByPostalCodeReq request) {
        return eventFinderRepository.findByPostalCode(request.getPostalCode(),getPageAbleInfo(request));
    }

    @Override
    public Page<Event> findByStreet(EventFindByStreetReq request) {
        return eventFinderRepository.findByStreet(request.getStreet(), getPageAbleInfo(request));
    }

    @Override
    public Page<Event> findByName(EventFindByNameReq request) {
        return eventFinderRepository.findByName(request.getName(),getPageAbleInfo(request));
    }

    @Override
    public Page<Event> findByTime(EventFindByTimeReq request) {
        return eventFinderRepository.findByTime(request.getTime(), getPageAbleInfo(request));
    }

    @Override
    public Page<Event> findByOrganizer(EventFindByOrganizerReq request) {
        return eventFinderRepository.findByOrganizer(request.getOrganizer(), getPageAbleInfo(request));
    }

    @Override
    public void saveFetchedData(List<Event> events) {
        eventFinderRepository.saveAll(events);
    }

    @Override
    public Page<Event> betweenStartAndEnd(EventFindByDateBetweenReq request) {
        return eventFinderRepository
                .findAllByStartDateLessThanEqualAndEndDateGreaterThanEqual(
                        request.getStartDate(),request.getEndDate(), getPageAbleInfo(request));
    }


    private Pageable getPageAbleInfo(BaseRequest request){
        return PageRequest.of(request.getPage(),request.getSize());
    }
}
