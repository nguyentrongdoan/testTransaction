package com.example.demo.service.impl;

import com.example.demo.convert.ConvertModel;
import com.example.demo.dto.MedicalRecordDTO;
import com.example.demo.entity.MedicalRecordEntity;
import com.example.demo.repository.MedicalRecordRepository;
import com.example.demo.service.MedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MedicalRecordImpl implements MedicalRecordService {
    @Autowired
    private MedicalRecordRepository medicalRecordRepository;
    @Autowired
    private ConvertModel convertModel;

    @Override
    @Transactional
    public void save(MedicalRecordEntity medicalRecordEntity) {
        medicalRecordRepository.save(medicalRecordEntity);
    }

//    @Override
//    public void save(MedicalRecordDTO medicalRecordDTO) {
////        MedicalRecordEntity medicalRecordEntity = convertModel.convertToEntity(medicalRecordDTO);
////        medicalRecordRepository.save(medicalRecordEntity);
//    }

}
