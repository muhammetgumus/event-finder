package com.event.finder.repository;

import com.event.finder.model.Event;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface EventFinderRepository extends PagingAndSortingRepository<Event,String> {

    Page<Event> findByName(String name);
    Page<Event> findByPlace(String place);
    Page<Event> findByPostalCode(String postalCode);
    Page<Event> findByStreet(String street);
    Page<Event> findByTime(String time);
    Page<Event> findByOrganizer(String organizer);
    Page<Event> findAllByStartDateLessThanEqualAndEndDateGreaterThanEqual(Date startDate, Date endDate);

}
