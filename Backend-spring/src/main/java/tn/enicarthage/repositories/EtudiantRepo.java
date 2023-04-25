package tn.enicarthage.repositories;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import tn.enicarthage.entities.Etudiant;

@Repository
public interface EtudiantRepo extends JpaRepository<Etudiant,Long > {

	Etudiant findByEmail(String email);
	@Query(value = "SELECT * FROM Etudiant WHERE grp_id = ?1", nativeQuery = true)
	List<Etudiant> findEtudiantByIdGroupe(String id);
	
	@Query(value = "SELECT * FROM Etudiant WHERE name = ?1 and surname = ?2", nativeQuery = true)
	List<Etudiant> findEtudiantByNameAndSurname(String nom, String prenom);


	@Query(value = "SELECT * FROM etudiant e WHERE e.grp_id=?2 AND e.id IN "
			+ "(SELECT a.etudiant_id FROM absence a WHERE a.matiere_id = ?1 "
			+ "GROUP BY a.etudiant_id HAVING COUNT(*) > (SELECT m.nb_seance FROM matiere m WHERE m.id = ?1))", nativeQuery = true)
	List<Etudiant> findEtudiantsWithExceededAbsences(String matiereId, String grpId);



}
