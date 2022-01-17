package com.event.finder.dto.request;

import lombok.Data;

import javax.validation.constraints.Min;

@Data
public class EventFindByIdReq {
    @Min(value = 0,message = "Id can not be negative value")
    private String id;
}
