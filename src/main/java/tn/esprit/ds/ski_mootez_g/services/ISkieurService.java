package tn.esprit.ds.ski_mootez_g.services;

import tn.esprit.ds.ski_mootez_g.entities.Skieur;

import java.util.List;

public interface ISkieurService {
    List<Skieur> retrieveAllSkieurs();
    Skieur addSkieur(Skieur skieur);

    void removeSkieur (Long numSkieur);
    Skieur retrieveSkieur (Long numSkieur);
    Skieur updateSkieur(Skieur skieur);

    Skieur assignSkieurToPiste(Long numSkieur, Long numPiste);


}
