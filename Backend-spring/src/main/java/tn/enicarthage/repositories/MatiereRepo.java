package tn.enicarthage.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import tn.enicarthage.entities.Matiere;

@Repository
public interface MatiereRepo extends JpaRepository<Matiere, String> {


}
