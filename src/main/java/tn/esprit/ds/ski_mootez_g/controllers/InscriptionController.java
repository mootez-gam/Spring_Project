package tn.esprit.ds.ski_mootez_g.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ds.ski_mootez_g.entities.Inscription;
import tn.esprit.ds.ski_mootez_g.services.IInscriptionService;


import java.util.List;
@RequestMapping("inscription")
@RestController
public class InscriptionController {

    @Autowired
    IInscriptionService iInscriptionService;
    //localhost:9090/retrieveAllInscriptions
    @GetMapping
    public List<Inscription> get_All()
    {
        return iInscriptionService.retrieveAllInscription();
    }
    //localhost:9090/addInscription
    @PostMapping
    public Inscription add_Inscription(@RequestBody Inscription Inscription)
    {
        return iInscriptionService.addInscription(Inscription);
    }

    @GetMapping("{numInscription}")
    Inscription retrieveInscription (@PathVariable Long numInscription)
    {
        return iInscriptionService.retrieveInscription(numInscription);

    }
    @DeleteMapping("{numInscription}")
    void removeInscription (@PathVariable Long numInscription)
    {
        iInscriptionService.removeInscription(numInscription);
    }

    @PutMapping
    public Inscription updateInscription(@RequestBody Inscription Inscription)
    {
        return iInscriptionService.updateInscription(Inscription);
    }


}
