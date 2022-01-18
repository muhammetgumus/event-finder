package com.event.finder.dto.request;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class EventFindByStreetReq extends BaseRequest {
    @NotNull(message = "Street can not be null")
    private String street;
}
