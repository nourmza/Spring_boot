package com.example.exsoftwareengineering.repository;

import com.example.exsoftwareengineering.entity.Clinique;
import com.example.exsoftwareengineering.entity.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface MedecinRepository extends JpaRepository<Medecin,Long> {
}
