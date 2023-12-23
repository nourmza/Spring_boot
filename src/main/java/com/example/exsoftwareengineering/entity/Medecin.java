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

public class Medecin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMedecin;
    private String nomMedecin;
    @Enumerated(EnumType.STRING)
    private Specialité specialité ;
    private  int telephone;
    private int PrixConsultaion;
    @ManyToMany(mappedBy = "medecins")
    private List <Clinique> cliniques;
    @OneToMany(mappedBy = "medecin")
    private List <RendezVous> rendezVousList;

}
