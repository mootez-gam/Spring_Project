package tn.esprit.ds.ski_mootez_g.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.ds.ski_mootez_g.entities.Cours;

public interface CoursRepository extends JpaRepository<Cours,Long> {
}
