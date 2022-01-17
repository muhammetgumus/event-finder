package com.event.finder.dto.request;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class EventFindByNameReq {
    @NotNull(message = "Name can not be null")
    private String name;
}
