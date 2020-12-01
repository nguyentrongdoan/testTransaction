package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "medical_record")
public class MedicalRecordEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer medicalRecordId;

    private String medicalRecordNumber;

    private String reasonsMedicalExamination;
}
