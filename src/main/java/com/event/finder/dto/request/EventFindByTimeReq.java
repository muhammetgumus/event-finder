package com.event.finder.dto.request;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class EventFindByTimeReq extends BaseRequest{
    @NotNull(message = "Time can not be null")
    private String time;
}
