package com.alessandro.graphql.graphql.response;

import com.alessandro.graphql.graphql.model.Student;
import com.alessandro.graphql.graphql.model.Subject;
import lombok.Data;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alessandro Arosio - 26/09/2020 07:18
 */
@Data
public class StudentResponse {
    private long id;

    private String firstName;

    private String lastName;

    private String email;

    private String street;

    private String city;

    private List<SubjectResponse> learningSubjects;

    // for internal use. do not put in the schema
    private Student student;

    private String fullName;

    public StudentResponse (Student student) {
        this.id = student.getId();
        this.firstName = student.getFirstName();
        this.lastName = student.getLastName();
        this.email = student.getEmail();
        this.student = student;

        this.street = student.getAddress().getStreet();
        this.city = student.getAddress().getCity();
    }
}
