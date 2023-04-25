package tn.enicarthage.services;

import java.util.List;

import tn.enicarthage.entities.EnumDep;
import tn.enicarthage.entities.Groupe;



public interface IGroupeServ {

	public Groupe addGroupe(Groupe c);
	public Groupe updateGroupe(Groupe c);
	public void deleteGroupe(Groupe c);
	public void deleteGroupeById(String id);
	public Groupe getGroupeById(String id );
	public List<Groupe> getAllGroupe();

	
	
}
