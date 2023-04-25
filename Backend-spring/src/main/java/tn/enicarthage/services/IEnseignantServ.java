package tn.enicarthage.services;





import tn.enicarthage.entities.Enseignant;

import java.util.List;


public interface IEnseignantServ {

	public Enseignant authentificate(String login,String password);
	public void logOut(String login);
	
	public Enseignant addEnseignant(Enseignant ens);
	public Enseignant updateEnseignant(Enseignant ens);
	public void deleteEnseignant(Enseignant ens);
	public Enseignant getEnseignantByCin(long cin);


	
	
}
