package com.example.demo.repository;

import com.example.demo.entity.MedicalRecordHospitalizationStatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalRecordHospitalizationStatusRepository extends JpaRepository<MedicalRecordHospitalizationStatusEntity, Integer> {
}
