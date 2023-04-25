package tn.enicarthage.services;

import java.util.List;


import tn.enicarthage.entities.Matiere;

public interface IMatiereServ {
	
	public Matiere addMatiere(Matiere c);
	public Matiere updateMatiere(Matiere c);
	public void deleteMatiere(Matiere c);
	public void deleteMatieretById(String id);
	public Matiere getMatiereById(String id );
	public List<Matiere> getAllMatiere();

	
}
