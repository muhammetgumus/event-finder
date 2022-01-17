package com.event.finder.dto;

import com.event.finder.model.Event;
import com.event.finder.model.Messages;
import com.event.finder.model.Results;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ThirdPartyApiDto {
    private Messages messages;
    private Results results;
    @JsonProperty("index")
    private Event[] data;
}
