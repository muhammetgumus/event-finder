package com.event.finder.controller;

import com.event.finder.dto.request.*;
import com.event.finder.dto.response.BaseResponse;
import com.event.finder.model.Event;
import com.event.finder.service.EventFinderService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class EventFinderController {

    private final EventFinderService eventFinderService;

    @PostMapping("/all")
    @ResponseBody
    public BaseResponse<Page<Event>> allEvents(@RequestBody EventAllReq request) {
        return new BaseResponse().ok(eventFinderService
                .allEvents(request));
    }

    @PostMapping("/findById")
    @ResponseBody
    public BaseResponse<Event> findById(@RequestBody EventFindByIdReq request) {
        return new BaseResponse().ok(eventFinderService.findById(request));
    }

    @PostMapping("/findByName")
    @ResponseBody
    public BaseResponse<Page<Event>> findByName(@RequestBody EventFindByNameReq request) {
        return new BaseResponse().ok(eventFinderService.findByName(request));
    }

    @PostMapping("/findByOrganizer")
    @ResponseBody
    public BaseResponse<Page<Event>> findByOrganizer(@RequestBody EventFindByOrganizerReq request) {
        return new BaseResponse().ok(eventFinderService.findByOrganizer(request));
    }

    @PostMapping("/findByPlace")
    @ResponseBody
    public BaseResponse<Page<Event>> findByPlace(@RequestBody EventFindByPlaceReq request) {
        return new BaseResponse().ok(eventFinderService.findByPlace(request));
    }

    @PostMapping("/findByPostalCode")
    @ResponseBody
    public BaseResponse<Page<Event>> findByPostalCode(@RequestBody EventFindByPostalCodeReq request) {
        return new BaseResponse().ok(eventFinderService.findByPostalCode(request));
    }

    @PostMapping("/findByStreet")
    @ResponseBody
    public BaseResponse<Page<Event>> findByStreet(@RequestBody EventFindByStreetReq request) {
        return new BaseResponse().ok(eventFinderService.findByStreet(request));
    }

    @PostMapping("/findByTime")
    @ResponseBody
    public BaseResponse<Page<Event>> findByTime(@RequestBody EventFindByTimeReq request) {
        return new BaseResponse().ok(eventFinderService.findByTime(request));
    }


    @PostMapping("/findByDateBetween")
    @ResponseBody
    public BaseResponse<Page<Event>> findByDateBetween(@RequestBody EventFindByDateBetweenReq request) {
        return new BaseResponse().ok(eventFinderService.
                betweenStartAndEnd(request));
    }


}
