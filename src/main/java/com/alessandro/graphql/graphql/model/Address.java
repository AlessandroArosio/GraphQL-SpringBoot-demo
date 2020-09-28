package com.alessandro.graphql.graphql.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author Alessandro Arosio - 26/09/2020 07:04
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "address")
@Builder
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String street;

    private String city;

    @OneToOne(mappedBy = "address")
    private Student student;
}
