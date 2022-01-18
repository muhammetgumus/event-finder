package com.event.finder.dto.request;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class EventFindByNameReq extends BaseRequest{
    @NotNull(message = "Name can not be null")
    private String name;
}
