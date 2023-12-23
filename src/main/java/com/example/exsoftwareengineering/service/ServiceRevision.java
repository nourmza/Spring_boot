package com.example.exsoftwareengineering.service;

import com.example.exsoftwareengineering.entity.*;

import java.util.List;

public interface ServiceRevision {
    Clinique addclinique(Clinique clinique);

    Clinique addClinique (Clinique clinique);
    Medecin addMedecinAndAssignToClinique (Medecin medecin,Long cliniqueId);
    Patient addPatient(Patient patient);
    RendezVous addRDVAndAssignMedAndPatient(RendezVous rendezVous, Long idMedecin, Long idPatient);
    List<RendezVous>getRendezVousByCliniqueAndSpecialite(Long idClinique , Specialité specialité);
    int getNbrRendezVousMedecin(Long idMedecin);
}
