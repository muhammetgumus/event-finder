package com.event.finder.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Results {
    private Integer count;
    @JsonProperty("items_per_page")
    private Integer itemsPerPage;
}
