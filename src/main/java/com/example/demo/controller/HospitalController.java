package com.example.demo.controller;

import com.example.demo.dto.HospitalDTO;
import com.example.demo.dto.MedicalRecordDTO;
import com.example.demo.entity.MedicalRecordDiagnosesEntity;
import com.example.demo.entity.MedicalRecordEntity;
import com.example.demo.entity.MedicalRecordHospitalizationStatusEntity;
import com.example.demo.repository.MedicalRecordDiagnosesRepository;
import com.example.demo.service.impl.HospitalImpl;
import com.example.demo.service.impl.MedicalRecordDiagnosesImpl;
import com.example.demo.service.impl.MedicalRecordHospitalizationStatusImpl;
import com.example.demo.service.impl.MedicalRecordImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HospitalController {
//    @Autowired
//    private MedicalRecordImpl record;
//
//    @Autowired
//    private MedicalRecordHospitalizationStatusImpl impl;
//
//    @Autowired
//    private MedicalRecordDiagnosesImpl medicalRecordDiagnoses;
    @Autowired
    private HospitalImpl hospital;

    @PostMapping("/save")
    public ResponseEntity<?> create(@RequestBody HospitalDTO hospitalDTO){
        if (hospitalDTO != null){
            hospital.testTransaction(hospitalDTO);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
//    @Transactional(rollbackFor = Exception.class, readOnly = true)
//    public void test(HospitalDTO hospitalDTO){
//        MedicalRecordEntity entity = new MedicalRecordEntity();
//        entity.setMedicalRecordNumber(hospitalDTO.getMedicalRecordNumber());
//        entity.setReasonsMedicalExamination(hospitalDTO.getReasonsMedicalExamination());
//        hospital.save(entity);
//        MedicalRecordHospitalizationStatusEntity entity1 = new MedicalRecordHospitalizationStatusEntity();
//        entity1.setHospitalDescription(hospitalDTO.getHospitalDescription());
//        hospital.save1(entity1);
//
//        MedicalRecordDiagnosesEntity entity2 = new MedicalRecordDiagnosesEntity();
//        entity2.setDiagnosesDescription(hospitalDTO.getDiagnosesDescription());
//        hospital.save2(entity2);
//    }
}
