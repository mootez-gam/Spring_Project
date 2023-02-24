package tn.esprit.ds.ski_mootez_g.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.ds.ski_mootez_g.entities.Inscription;
import tn.esprit.ds.ski_mootez_g.repositories.InscriptionRepository;

import java.util.List;

@Service
public class IInscriptionServiceImp implements IInscriptionService {
    @Autowired
    InscriptionRepository inscriptionRepository;
    @Override
    public Inscription addInscription(Inscription inscription) {
        return inscriptionRepository.save(inscription);    }

    @Override
    public List<Inscription> retrieveAllInscription() {
        return inscriptionRepository.findAll();
    }

    @Override
    public void removeInscription(Long numInscription) {
    inscriptionRepository.deleteById(numInscription);
    }

    @Override
    public Inscription retrieveInscription(Long numInscription) {
        return inscriptionRepository.findById(numInscription).orElse(null);
    }

    @Override
    public Inscription updateInscription(Inscription inscription) {
        return inscriptionRepository.save(inscription);
    }
}
