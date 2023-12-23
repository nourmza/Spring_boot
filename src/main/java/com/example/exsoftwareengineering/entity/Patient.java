package com.example.exsoftwareengineering.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity

public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPatient;
    private String nomPatient;

    private int telephone;
    private Date dateNaissance ;
    @OneToMany(mappedBy = "patient")
    private List<RendezVous> rendezVousList;

}
