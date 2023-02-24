package tn.esprit.ds.ski_mootez_g.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ds.ski_mootez_g.entities.Skieur;
import tn.esprit.ds.ski_mootez_g.services.ISkieurService;
import tn.esprit.ds.ski_mootez_g.services.ISkieurServiceImp;

import javax.persistence.PostRemove;
import javax.persistence.PreRemove;
import java.util.List;
@RequestMapping("skieur")
@RestController //indique que la classe est un controlleur et traite les requetes HTTP et renvoie les reponses HTTP
public class SkieurController {
    @Autowired
    ISkieurService iSkieurService;
    //localhost:9090/retrieveAllSkieurs
    @GetMapping
    public List<Skieur> get_All()
    {
       return iSkieurService.retrieveAllSkieurs();
    }
    @GetMapping("{numSkieur}")
    Skieur retrieveSkieur (@PathVariable Long numSkieur)
    {
        return iSkieurService.retrieveSkieur(numSkieur);

    }
    //localhost:9090/addskieur
    @PostMapping
    public Skieur add_skieur(@RequestBody Skieur skieur)
    {
        return iSkieurService.addSkieur(skieur);
    }

    @DeleteMapping("{numSkieur}")
    void removeSkieur (@PathVariable Long numSkieur)
    {
        iSkieurService.removeSkieur(numSkieur);
    }
    @PutMapping
    public Skieur updateSkieur(@RequestBody Skieur skieur)
    {
        return iSkieurService.updateSkieur(skieur);
    }

    @PutMapping("{numSkieur}/{numPiste}")
    public Skieur assignSkieurToPiste(@PathVariable Long numSkieur,@PathVariable Long numPiste)
    {
        return iSkieurService.assignSkieurToPiste(numSkieur,numPiste);

    }


}
