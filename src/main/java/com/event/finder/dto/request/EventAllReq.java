package com.event.finder.dto.request;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Min;

@Data
public class EventAllReq extends BaseRequest {
    @Min(value = 0,message = "Id can not be negative value")
    private Integer page=0;
    @Min(value =0 ,message = "Id can not be negative value")
    private Integer size=10;
}
