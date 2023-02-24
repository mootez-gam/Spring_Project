package tn.esprit.ds.ski_mootez_g.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.ds.ski_mootez_g.entities.Moniteur;
import tn.esprit.ds.ski_mootez_g.repositories.MoniteurRepository;

import java.util.List;

@Service
public class IMoniteurServiceImp implements IMoniteurService{
    @Autowired
    MoniteurRepository moniteurRepository;

    @Override
    public Moniteur addMoniteur(Moniteur Moniteur) {
        return moniteurRepository.save(Moniteur);
    }

    @Override
    public List<Moniteur> retrieveAllMoniteur() {
        return moniteurRepository.findAll();
    }

    @Override
    public void removeMoniteur(Long numMoniteur) {
    moniteurRepository.deleteById(numMoniteur);
    }

    @Override
    public Moniteur retrieveMoniteur(Long numMoniteur) {
        return moniteurRepository.findById(numMoniteur).orElse(null);
    }

    @Override
    public Moniteur updateMoniteur(Moniteur Moniteur) {
        return moniteurRepository.save(Moniteur);
    }
}
