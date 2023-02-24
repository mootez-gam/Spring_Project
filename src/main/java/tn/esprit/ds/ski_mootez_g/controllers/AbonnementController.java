package tn.esprit.ds.ski_mootez_g.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ds.ski_mootez_g.entities.Abonnement;
import tn.esprit.ds.ski_mootez_g.services.IAbonnementService;

import java.util.List;
@RequestMapping("abonnement")
@RestController
public class AbonnementController {
    @Autowired
    IAbonnementService iAbonnementService;
    //localhost:9090/retrieveAllAbonnement
    @GetMapping
    public List<Abonnement> get_All()
    {
        return iAbonnementService.retrieveAllAbonnement();
    }
    //localhost:9090/addAbonnement
    @PostMapping
    public Abonnement add_cour(@RequestBody Abonnement Abonnement)
    {
        return iAbonnementService.addAbonnement(Abonnement);
    }

    @GetMapping("{numAbonnement}")
    Abonnement retrieveAbonnement (@PathVariable Long numAbonnement)
    {
        return iAbonnementService.retrieveAbonnement(numAbonnement);

    }
    @DeleteMapping("{numAbonnement}")
    void removeAbonnement (@PathVariable Long numAbonnement)
    {
        iAbonnementService.removeAbonnement(numAbonnement);
    }
    @PutMapping
    public Abonnement updateAbonnement(@RequestBody Abonnement Abonnement)
    {
        return iAbonnementService.updateAbonnement(Abonnement);
    }
}
