package tn.enicarthage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.enicarthage.entities.Departement;
import tn.enicarthage.entities.EnumDep;

@Repository
public interface DepartementRepo extends JpaRepository<Departement, EnumDep> {

}
