package com.alessandro.graphql.graphql.mutation;

import com.alessandro.graphql.graphql.model.CreateStudentRequest;
import com.alessandro.graphql.graphql.model.Student;
import com.alessandro.graphql.graphql.response.StudentResponse;
import com.alessandro.graphql.graphql.service.StudentService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Alessandro Arosio - 28/09/2020 17:51
 */
@Service
@RequiredArgsConstructor
public class Mutation implements GraphQLMutationResolver {
    private final StudentService studentService;

    public StudentResponse createStudent(CreateStudentRequest request) {
        Student student = studentService.createStudent(request);
        return new StudentResponse(student);
    }
}
