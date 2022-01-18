package com.event.finder.dto.request;

import lombok.Data;

@Data
public class BaseRequest {
    public Integer page=0;
    public Integer size=10;
}
