package com.alessandro.graphql.graphql.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Alessandro Arosio - 28/09/2020 17:54
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateStudentRequest {

    private String firstName;
    private String lastName;
    private String email;
    private String street;
    private String city;
    private List<CreateSubjectRequest> subjectsLearning;
}
