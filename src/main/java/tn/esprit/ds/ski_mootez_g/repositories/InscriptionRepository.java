package tn.esprit.ds.ski_mootez_g.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.ds.ski_mootez_g.entities.Cours;
import tn.esprit.ds.ski_mootez_g.entities.Inscription;

public interface InscriptionRepository extends JpaRepository<Inscription,Long> {
}
