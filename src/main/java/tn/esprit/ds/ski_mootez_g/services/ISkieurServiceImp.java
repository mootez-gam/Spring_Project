package tn.esprit.ds.ski_mootez_g.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.ds.ski_mootez_g.entities.Piste;
import tn.esprit.ds.ski_mootez_g.entities.Skieur;
import tn.esprit.ds.ski_mootez_g.repositories.PisteRepository;
import tn.esprit.ds.ski_mootez_g.repositories.SkieurRespository;

import java.util.List;
@Service
public class ISkieurServiceImp  implements ISkieurService{
    @Autowired
    SkieurRespository skieurRespository ;
    PisteRepository pisteRepository;

    @Override
    public List<Skieur> retrieveAllSkieurs() {
        return skieurRespository.findAll();
    }

    @Override
    public Skieur addSkieur(Skieur skieur) {
        return skieurRespository.save(skieur);
    }

    @Override
    public void removeSkieur(Long numSkieur) {
        skieurRespository.deleteById(numSkieur);
    }

    @Override
    public Skieur retrieveSkieur(Long numSkieur)
    {
        return skieurRespository.findById(numSkieur).orElse(null);
    }

    @Override
    public Skieur updateSkieur(Skieur skieur)
    {
        return skieurRespository.save(skieur);
    }

    @Override
    public Skieur assignSkieurToPiste(Long numSkieur, Long numPiste) {
        Skieur skieur = skieurRespository.findById(numSkieur).orElse(null);
        Piste piste = pisteRepository.findById(numPiste).orElse(null);
       if(skieur != null && piste != null )
       {
           skieur.getPistes().add(piste);
           /*List<Piste> pistes = skieur.getPistes();
           pistes.add(piste);
           skieur.setPistes(pistes);*/
           skieurRespository.save(skieur);
       }
       return  null;
    }


}
