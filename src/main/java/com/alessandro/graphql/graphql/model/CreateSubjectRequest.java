package com.alessandro.graphql.graphql.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Alessandro Arosio - 28/09/2020 17:56
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateSubjectRequest {

    private String subjectName;
    private Double marksObtained;
}
