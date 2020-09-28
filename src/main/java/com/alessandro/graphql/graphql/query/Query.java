package com.alessandro.graphql.graphql.query;

import com.alessandro.graphql.graphql.model.Student;
import com.alessandro.graphql.graphql.response.StudentResponse;
import com.alessandro.graphql.graphql.service.StudentService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author Alessandro Arosio - 23/09/2020 18:29
 */

@Component
@RequiredArgsConstructor
public class Query implements GraphQLQueryResolver {
    private final StudentService studentService;

    public StudentResponse getStudent(Long id) {
        Student studentById = studentService.getStudentById(id);
        return new StudentResponse(studentById);
    }
}
