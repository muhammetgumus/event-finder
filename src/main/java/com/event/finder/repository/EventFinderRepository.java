package com.event.finder.repository;

import com.event.finder.model.Event;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface EventFinderRepository extends PagingAndSortingRepository<Event,String> {

    Page<Event> findByName(String name, Pageable pageable);
    Page<Event> findByPlace(String place, Pageable pageable);
    Page<Event> findByPostalCode(String postalCode, Pageable pageable);
    Page<Event> findByStreet(String street, Pageable pageable);
    Page<Event> findByTime(String time, Pageable pageable);
    Page<Event> findByOrganizer(String organizer, Pageable pageable);
    Page<Event> findAllByStartDateLessThanEqualAndEndDateGreaterThanEqual(Date startDate, Date endDate, Pageable pageable);

}
