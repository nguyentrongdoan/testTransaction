package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "medical_record_hospitalization_status")
public class MedicalRecordHospitalizationStatusEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer hospitalizationStatusId;

    private String HospitalDescription;

    private Integer medicalRecordId;
}
