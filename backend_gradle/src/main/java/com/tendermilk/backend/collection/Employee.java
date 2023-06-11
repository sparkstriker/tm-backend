package com.tendermilk.backend.collection;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Document(collection = "employee")
public class Employee {

    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String PhoneNo;
    private Boolean isActive;
}
