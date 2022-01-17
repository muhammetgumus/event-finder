package com.event.finder.controller;

import com.event.finder.model.Event;
import com.event.finder.service.EventFinderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class EventFinderController {

    private final EventFinderService eventFinderService;

    @GetMapping("/findEventById/{id}")
    public Event findEventById(@PathVariable String id){
        eventFinderService.findEventById(id);
    }
}
