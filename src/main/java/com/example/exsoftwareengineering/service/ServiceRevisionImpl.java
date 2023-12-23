package com.example.exsoftwareengineering.service;

import com.example.exsoftwareengineering.entity.*;
import com.example.exsoftwareengineering.repository.CliniqueRepository;
import com.example.exsoftwareengineering.repository.MedecinRepository;
import com.example.exsoftwareengineering.repository.PatientRepository;
import com.example.exsoftwareengineering.repository.RendezVousRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class ServiceRevisionImpl implements ServiceRevision {
    @Autowired
    private CliniqueRepository cliniqueRepository;
    @Autowired
    private MedecinRepository medecinRepository;
    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private RendezVousRepository rendezVousRepository;
    private Clinique c;

    @Override
    public Clinique addclinique(Clinique clinique) {
        return cliniqueRepository.save(clinique);
    }

    @Override
    public Clinique addClinique(Clinique clinique) {
        return null;
    }

    @Override
    public Medecin addMedecinAndAssignToClinique(Medecin medecin, Long cliniqueId) {
        Clinique c = cliniqueRepository.findById(cliniqueId).orElse(null);
        List<Medecin> List = new ArrayList<>();
        java.util.List<Medecin> list = null;
        list.add(medecin);
        if (c.getMedecins() == null) {
            c.setMedecins(list);

        } else {
            c.getMedecins().add(medecin);

        }
        return medecinRepository.save(medecin);
    }

    @Override
    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public RendezVous addRDVAndAssignMedAndPatient(RendezVous rendezVous, Long idMedecin, Long idPatient) {
        Medecin m = medecinRepository.findById(idMedecin).orElse(null);
        Patient p = patientRepository.findById(idPatient).orElse(null);
        rendezVous.setPatient(p);
        rendezVous.setMedecin(m);
        return rendezVousRepository.save(rendezVous);
    }

    @Override
    public List<RendezVous> getRendezVousByCliniqueAndSpecialite(Long idClinique, Specialité specialité) {
        List<RendezVous> list = rendezVousRepository.findAll();
        List<RendezVous> resultat = new ArrayList<>();
        for (RendezVous r : list) {
            if (r.getMedecin().getCliniques() != null) {
                for (Clinique cc : r.getMedecin().getCliniques()) {
                    if (c.equals(cc)) {
                        resultat.add(r);

                    }
                }
            }
        }


        return list;
    }

    @Override
    public int getNbrRendezVousMedecin(Long idMedecin) {
        return 0;
    }

}



