package tn.enicarthage.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.enicarthage.entities.Groupe;


@Repository
public interface GroupeRepo extends JpaRepository<Groupe, String> {

}
