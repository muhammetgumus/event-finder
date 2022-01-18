package com.event.finder.dto.request;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;

@Data
public class EventFindByDateBetweenReq extends BaseRequest {
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date startDate;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date endDate;
}
