package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "medical_record_diagnoses")
@Data
public class MedicalRecordDiagnosesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer diagnosesId;

    private Integer medicalRecordId;

    private String diagnosesDescription;
}
