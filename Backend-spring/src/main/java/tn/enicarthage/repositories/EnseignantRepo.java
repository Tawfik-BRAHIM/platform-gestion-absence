package tn.enicarthage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.enicarthage.entities.Enseignant;

import java.util.List;

@Repository
public interface EnseignantRepo extends JpaRepository<Enseignant, Long> {
 Enseignant findByEmail(String email);

}
