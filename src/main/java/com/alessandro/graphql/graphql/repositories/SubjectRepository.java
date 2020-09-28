package com.alessandro.graphql.graphql.repositories;

import com.alessandro.graphql.graphql.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Alessandro Arosio - 26/09/2020 07:13
 */
public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
