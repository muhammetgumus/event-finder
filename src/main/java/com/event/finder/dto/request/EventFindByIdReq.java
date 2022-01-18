package com.event.finder.dto.request;

import lombok.Data;
import javax.validation.constraints.NotNull;

@Data
public class EventFindByIdReq extends BaseRequest{
    @NotNull(message = "Id can not be null")
    private String id;
}
