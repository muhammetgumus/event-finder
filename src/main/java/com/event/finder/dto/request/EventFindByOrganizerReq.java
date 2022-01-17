package com.event.finder.dto.request;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class EventFindByOrganizer {
    @NotNull(message = "Organizer can not be null")
    private String organizer;
}
