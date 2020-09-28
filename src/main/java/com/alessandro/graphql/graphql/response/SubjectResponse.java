package com.alessandro.graphql.graphql.response;

import com.alessandro.graphql.graphql.model.Subject;
import lombok.Data;

/**
 * @author Alessandro Arosio - 26/09/2020 07:20
 */
@Data
public class SubjectResponse {
    private Long id;

    private String subjectName;

    private Double marksObtained;

    public SubjectResponse (Subject subject) {
        this.id = subject.getId();
        this.subjectName = subject.getSubjectName();
        this.marksObtained = subject.getMarksObtained();
    }
}
