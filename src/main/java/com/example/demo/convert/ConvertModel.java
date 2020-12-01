package com.example.demo.convert;

import com.example.demo.dto.MedicalRecordDTO;
import com.example.demo.entity.MedicalRecordEntity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ConvertModel {
    private ModelMapper modelMapper = new ModelMapper();
    public MedicalRecordEntity convertToEntity(MedicalRecordDTO medicalRecordDTO){
        MedicalRecordEntity medicalRecordEntity = modelMapper.map(medicalRecordDTO, MedicalRecordEntity.class);
        return medicalRecordEntity;
    }
}
