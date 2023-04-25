package tn.enicarthage.services;

import java.util.List;


import tn.enicarthage.entities.Etudiant;

public interface IEtudiantServ {
	public Etudiant authentificate(String login,String password);
	public void logOut(String cin);
	
	public Etudiant addEtudiant(Etudiant member);
	public Etudiant updateEtudiant(Etudiant member);
	public void deleteEtudiant(long cin);
	public Etudiant getEtudiantByCin(long cin);
	public List<Etudiant> getEtudiantByNameAndFirstname(String name, String firsname);
	public Etudiant getEtudiantByEmail(String email);
	
	public List<Etudiant> getAllEtudiant();
	public List<Etudiant> getEtudiantByIdGroupe(String name);

	public List<Etudiant > getEtudiantEleminieParGrpAndMAt(String matId,String groupeId );
	

	
}
