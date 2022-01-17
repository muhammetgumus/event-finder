package com.event.finder.dto.request;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class EventFindByStreetReq {
    @NotNull(message = "Street can not be null")
    private String street;
}
