package com.example.demo.service.impl;

import com.example.demo.entity.MedicalRecordDiagnosesEntity;
import com.example.demo.repository.MedicalRecordDiagnosesRepository;
import com.example.demo.service.MedicalRecordDiagnosesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicalRecordDiagnosesImpl implements MedicalRecordDiagnosesService {
    @Autowired
    private MedicalRecordDiagnosesRepository medicalRecordDiagnosesRepository;
    @Override
    public void save(MedicalRecordDiagnosesEntity medicalRecordDiagnosesEntity) {
        medicalRecordDiagnosesRepository.save(medicalRecordDiagnosesEntity);
    }
}
