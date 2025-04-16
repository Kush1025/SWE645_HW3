package com.kush.survey.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class StudentSurvey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("first_name")
    private String first_name;

    @JsonProperty("last_name")
    private String last_name;

    @JsonProperty("street_address")
    private String street_address;

    @JsonProperty("city")
    private String city;
    @JsonProperty("state")
    private String state;
    @JsonProperty("zip")
    private String zip;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("email")
    private String email;

    @JsonProperty("survey_date")
    @Column(name = "survey_date", nullable = false)
    private LocalDate survey_date;

    @JsonProperty("liked_most")
    @ElementCollection
    private List<String> liked_most;

    @JsonProperty("how_interested")
    @ElementCollection
    private List<String> how_interested;

    @JsonProperty("recommendation_likelihood")
    private String recommendation_likelihood;
}
