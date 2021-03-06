package com.event.finder.dto.request;

import lombok.Data;
import javax.validation.constraints.NotNull;

@Data
public class EventFindByPlaceReq extends BaseRequest {
    @NotNull(message = "Place can not be null")
    private String place;
}
