package com.alessandro.graphql.graphql.service;

import com.alessandro.graphql.graphql.model.CreateStudentRequest;
import com.alessandro.graphql.graphql.model.Student;

/**
 * @author Alessandro Arosio - 26/09/2020 07:26
 */
public interface StudentService {
    Student getStudentById(Long id);

    Student createStudent(CreateStudentRequest request);
}
