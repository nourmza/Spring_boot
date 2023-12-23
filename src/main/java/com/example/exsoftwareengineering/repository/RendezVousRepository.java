package com.example.exsoftwareengineering.repository;

import com.example.exsoftwareengineering.entity.Medecin;
import com.example.exsoftwareengineering.entity.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RendezVousRepository extends JpaRepository<RendezVous,Long>{
}
