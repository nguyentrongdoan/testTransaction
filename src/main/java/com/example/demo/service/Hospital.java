package com.example.demo.service;

import com.example.demo.dto.HospitalDTO;
import com.example.demo.entity.MedicalRecordDiagnosesEntity;
import com.example.demo.entity.MedicalRecordEntity;
import com.example.demo.entity.MedicalRecordHospitalizationStatusEntity;

public interface Hospital {
    void save(MedicalRecordEntity entity);
    void save1(MedicalRecordHospitalizationStatusEntity entity1);
    void save2(MedicalRecordDiagnosesEntity entity2);
    void testTransaction(HospitalDTO hospitalDTO);
}
