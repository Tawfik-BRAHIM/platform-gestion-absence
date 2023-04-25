package tn.enicarthage.repositories;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;

import tn.enicarthage.entities.Absence;


@Repository
public interface AbsenceRepo extends JpaRepository<Absence, String> {



	@Query(value = "SELECT a.matiere_id, COUNT(*) AS nb_absences "
			+ "FROM absence a "
			+ "WHERE a.etudiant_id = ?1 AND a.matiere_id = ?2 "
			+ "GROUP BY a.matiere_id", nativeQuery = true)
	List<Object[]> countAbsencesByMatiereForEtudiant(Long etudiantId, String matiereId);

	@Query(value = "SELECT e.name, e.surname, COUNT(*) AS nb_absences "
			+ "FROM etudiant e JOIN absence a ON e.id = a.etudiant_id "
			+ "WHERE e.grp_id = ?1 AND a.matiere_id = ?2 "
			+ "GROUP BY e.id, e.name, e.surname", nativeQuery = true)
	List<Object[]> countAbsencesByMatiereForGroupe(String grpId, String matiereId);
}

