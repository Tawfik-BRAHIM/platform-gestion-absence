package tn.enicarthage.services;

import java.util.List;

import tn.enicarthage.entities.Absence;


public interface IAbsenceServ {
	public Absence addAbsence(Absence c);
	public Absence updateAbsence(Absence c);

	public void deleteAbsenceById(String id);
	public List<Object[]> getNombreAbsencesParMatiere(long etudiant, String matiere);
	public List<Absence> getAllAbsences();
	public List<Object[]> getNombreAbsencesParMatiereForGroup(String group, String matiere);
	
	
	

}
