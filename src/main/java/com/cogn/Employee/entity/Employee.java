package com.cogn.Employee.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        Long empId;
        String empFirstName;
        String empLastName;
        String empPhone;
        String empLocation;
        String empEmail;
        String empDesignation;

    }


