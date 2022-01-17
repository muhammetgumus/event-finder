package com.event.finder.dto.request;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class EventFindByPostalCodeReq {
    @NotNull(message = "Postal code can not be null")
    private String postalCode;
}
