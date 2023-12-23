package com.example.exsoftwareengineering.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity

public class RendezVous {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRDV;
    private Date dateRDV;

    private String remarque;
    @ManyToOne
    private Medecin medecin;
    @ManyToOne
    private Patient patient;

}
