package com.example.exsoftwareengineering.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity

public class Clinique {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClinique;
    private String nomClinique;

    private String adresse;
    private int telephone;
    @ManyToMany
    private List<Medecin> medecins;
}
