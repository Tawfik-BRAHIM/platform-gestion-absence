package tn.enicarthage.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.enicarthage.entities.Absence;

import tn.enicarthage.repositories.AbsenceRepo;

@Service
public class AbsenceServ implements IAbsenceServ {

	@Autowired
	AbsenceRepo absenceRep;
	@Override
	public Absence addAbsence(Absence c) {
		// TODO Auto-generated method stub
		return absenceRep.save(c) ;
	}

	@Override
	public Absence updateAbsence(Absence c) {
		// TODO Auto-generated method stub
		return absenceRep.save(c) ;
	}



	@Override
	public void deleteAbsenceById(String id) {
		// TODO Auto-generated method stub
		 absenceRep.deleteById(id); ;
	}

	

	@Override
	public List<Absence> getAllAbsences() {
		// TODO Auto-generated method stub
		return absenceRep.findAll() ;
	}

	@Override
	public List<Object[]> getNombreAbsencesParMatiereForGroup(String group, String matiere) {
		return absenceRep.countAbsencesByMatiereForGroupe(group,matiere);
	}

	@Override
	public List<Object[]> getNombreAbsencesParMatiere(long etudiant, String matiere) {
		return absenceRep.countAbsencesByMatiereForEtudiant(etudiant, matiere);
	}


	


}
