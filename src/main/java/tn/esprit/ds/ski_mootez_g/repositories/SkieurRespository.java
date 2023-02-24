package tn.esprit.ds.ski_mootez_g.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.ds.ski_mootez_g.entities.Skieur;

public interface SkieurRespository extends JpaRepository<Skieur,Long> {
}
