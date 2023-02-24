package tn.esprit.ds.ski_mootez_g.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.ds.ski_mootez_g.entities.Cours;
import tn.esprit.ds.ski_mootez_g.entities.Skieur;
import tn.esprit.ds.ski_mootez_g.repositories.CoursRepository;
import tn.esprit.ds.ski_mootez_g.repositories.PisteRepository;
import tn.esprit.ds.ski_mootez_g.repositories.SkieurRespository;

import java.util.List;

@Service
public class ICoursServiceImp implements ICoursService {

    @Autowired
    CoursRepository coursRepository;
    @Override
    public Cours addcours(Cours cours) {
        return coursRepository.save(cours);
    }

    @Override
    public List<Cours> retrieveAllCours() {
        return coursRepository.findAll();
    }

    @Override
    public void removeCours(Long numCours) {
        coursRepository.deleteById(numCours);
    }

    @Override
    public Cours retrieveCours(Long numCours) {
        return coursRepository.findById(numCours).orElse(null);
    }

    @Override
    public Cours updateCours(Cours cours) {
        return coursRepository.save(cours);
    }
}
