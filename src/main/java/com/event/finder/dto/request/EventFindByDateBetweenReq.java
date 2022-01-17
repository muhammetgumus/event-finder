package com.event.finder.dto.request;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;

@Data
public class EventFindByDateBetweenReq {
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date startDate=new Date();

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date endDate=new Date();
}
