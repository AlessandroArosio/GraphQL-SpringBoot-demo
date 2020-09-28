package com.alessandro.graphql.graphql.service;

import com.alessandro.graphql.graphql.model.*;
import com.alessandro.graphql.graphql.repositories.AddressRepository;
import com.alessandro.graphql.graphql.repositories.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Alessandro Arosio - 26/09/2020 07:26
 */
@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    @Override
    public Student getStudentById(Long id) {
        Student student = studentRepository.findById(id).orElseThrow(RuntimeException::new);
        return student;
    }

    @Override
    public Student createStudent(CreateStudentRequest request) {
        Student student = Student.builder()
                .address(getAddress(request))
                .email(request.getEmail())
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .build();

        List<Subject> subjectList = getSubjectList(request.getSubjectsLearning(), student);
        student.setLearningSubjects(subjectList);

        return studentRepository.save(student);
    }

    private List<Subject> getSubjectList(List<CreateSubjectRequest> subjectRequestList, Student student) {
        return subjectRequestList.stream()
                .map(v -> Subject.builder()
                        .subjectName(v.getSubjectName())
                        .marksObtained(v.getMarksObtained())
                        .student(student)
                        .build())
                .collect(Collectors.toList());
    }

    private Address getAddress(CreateStudentRequest request) {
        return Address.builder()
                .street(request.getStreet())
                .city(request.getCity())
                .build();
    }
}
