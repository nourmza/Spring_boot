package com.example.exsoftwareengineering.repository;

import com.example.exsoftwareengineering.entity.Clinique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CliniqueRepository extends JpaRepository<Clinique,Long> {
}
