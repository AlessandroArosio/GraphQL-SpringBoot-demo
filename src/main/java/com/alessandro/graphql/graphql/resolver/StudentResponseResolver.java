package com.alessandro.graphql.graphql.resolver;

import com.alessandro.graphql.graphql.enums.SubjectNameFilter;
import com.alessandro.graphql.graphql.model.Subject;
import com.alessandro.graphql.graphql.response.StudentResponse;
import com.alessandro.graphql.graphql.response.SubjectResponse;
import com.coxautodev.graphql.tools.GraphQLResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author Alessandro Arosio - 27/09/2020 20:09
 */
@Service
@RequiredArgsConstructor
public class StudentResponseResolver implements GraphQLResolver<StudentResponse> {

    public List<SubjectResponse> getLearningSubjects(StudentResponse studentResponse, SubjectNameFilter subjectNameFilter) {
        List<Subject> subjects = studentResponse.getStudent().getLearningSubjects();

        return subjects.stream()
                .filter(subject -> subjectNameFilter != null && subjectNameFilter.name().equals(subject.getSubjectName()))
                .map(SubjectResponse::new)
                .collect(Collectors.toList());
    }

    public String fullName(StudentResponse studentResponse) {
        return String.format("%s %s", studentResponse.getFirstName(), studentResponse.getLastName());
    }
}
