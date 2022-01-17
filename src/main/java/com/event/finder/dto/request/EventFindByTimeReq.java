package com.event.finder.dto.request;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class EventFindByTimeReq {
    @NotNull(message = "Time can not be null")
    private String time;
}
