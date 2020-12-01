package com.example.demo.service.impl;

import com.example.demo.dto.HospitalDTO;
import com.example.demo.entity.MedicalRecordDiagnosesEntity;
import com.example.demo.entity.MedicalRecordEntity;
import com.example.demo.entity.MedicalRecordHospitalizationStatusEntity;
import com.example.demo.repository.MedicalRecordDiagnosesRepository;
import com.example.demo.repository.MedicalRecordHospitalizationStatusRepository;
import com.example.demo.repository.MedicalRecordRepository;
import com.example.demo.service.Hospital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class HospitalImpl implements Hospital {
    @Autowired
    private MedicalRecordDiagnosesRepository medicalRecordDiagnosesRepository;

    @Autowired
    private MedicalRecordHospitalizationStatusRepository hospitalizationStatusRepository;

    @Autowired
    private MedicalRecordRepository medicalRecordRepository;

    @Override
    public void save(MedicalRecordEntity entity) {
        medicalRecordRepository.save(entity);
    }

    @Override
    public void save1(MedicalRecordHospitalizationStatusEntity entity1) {
        hospitalizationStatusRepository.save(entity1);
    }

    @Override
    public void save2(MedicalRecordDiagnosesEntity entity2) {
        medicalRecordDiagnosesRepository.save(entity2);
    }

    @Override
    @Transactional(rollbackFor = Exception.class, readOnly = true)
    public void testTransaction(HospitalDTO hospitalDTO) {
        MedicalRecordEntity entity = new MedicalRecordEntity();
        entity.setMedicalRecordNumber(hospitalDTO.getMedicalRecordNumber());
        entity.setReasonsMedicalExamination(hospitalDTO.getReasonsMedicalExamination());
        medicalRecordRepository.save(entity);
        
        MedicalRecordHospitalizationStatusEntity entity1 = new MedicalRecordHospitalizationStatusEntity();
        entity1.setHospitalDescription(hospitalDTO.getHospitalDescription());
        hospitalizationStatusRepository.save(entity1);

        MedicalRecordDiagnosesEntity entity2 = new MedicalRecordDiagnosesEntity();
        entity2.setDiagnosesDescription(hospitalDTO.getDiagnosesDescription());
        medicalRecordDiagnosesRepository.save(entity2);
    }
}
