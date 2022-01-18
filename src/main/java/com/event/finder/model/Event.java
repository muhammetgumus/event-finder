package com.event.finder.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class Event {
    @Id
    @NotEmpty(message = "Id can not be blank")
    private String id;

    @NotEmpty(message = "Place can not be blank")
    @JsonProperty("ort")
    private String place;

    @NotEmpty(message = "Name can not be blank")
    @JsonProperty("bezeichnung")
    private String name;

    @NotEmpty(message = "Street can not be blank")
    @JsonProperty("strasse")
    private String street;

    @NotEmpty(message = "Postal Code can not be empty")
    @JsonProperty("plz")
    private String postalCode;

    @NotNull(message = "Start Date can not be empty")
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    @JsonProperty("von")
    private Date startDate;

    @NotNull(message = "End Date can not be empty")
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    @JsonProperty("bis")
    private Date endDate;

    @NotNull(message = "Time can not be empty")
    @JsonProperty("zeit")
    private String time;

    @NotEmpty(message = "Organizer can not be empty")
    @JsonProperty("veranstalter")
    private String organizer;

    @JsonProperty("mail")
    private String email;

    @JsonProperty("www")
    private String webAddress;

    @JsonProperty("bemerkungen")
    private String note;
}
