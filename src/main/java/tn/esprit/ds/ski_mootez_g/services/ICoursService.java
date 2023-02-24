package tn.esprit.ds.ski_mootez_g.services;


import tn.esprit.ds.ski_mootez_g.entities.Cours;
import tn.esprit.ds.ski_mootez_g.entities.Piste;


import java.util.List;

public interface ICoursService {
    Cours addcours(Cours cours);
    List<Cours> retrieveAllCours();

    void removeCours (Long numCours);
    Cours retrieveCours (Long numCours);
    Cours updateCours(Cours cours);
}
