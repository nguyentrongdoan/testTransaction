package com.example.demo.service.impl;

import com.example.demo.entity.MedicalRecordDiagnosesEntity;
import com.example.demo.entity.MedicalRecordHospitalizationStatusEntity;
import com.example.demo.repository.MedicalRecordDiagnosesRepository;
import com.example.demo.repository.MedicalRecordHospitalizationStatusRepository;
import com.example.demo.service.MedicalRecordHospitalizationStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicalRecordHospitalizationStatusImpl implements MedicalRecordHospitalizationStatusService {
    @Autowired
    private MedicalRecordHospitalizationStatusRepository hospitalizationStatusRepository;

    @Override
    public void save(MedicalRecordHospitalizationStatusEntity medicalRecordHospitalizationStatusEntity) {
        hospitalizationStatusRepository.save(medicalRecordHospitalizationStatusEntity);
    }
}
