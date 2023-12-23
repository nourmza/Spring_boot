package com.example.exsoftwareengineering.repository;

import com.example.exsoftwareengineering.entity.Medecin;
import com.example.exsoftwareengineering.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PatientRepository extends JpaRepository<Patient,Long> {
}
