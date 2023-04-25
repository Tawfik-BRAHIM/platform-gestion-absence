package tn.enicarthage.services;

import java.util.List;

import tn.enicarthage.entities.Departement;
import tn.enicarthage.entities.EnumDep;


public interface IDepartementServ {

	public Departement addDepartement(Departement c);
	public Departement updateDepartement(Departement c);
	public void deleteDepartement(Departement c);
	public void deleteDepartementById(EnumDep id);
	public Departement getDepartementById(EnumDep id );
	public List<Departement> getAllDepartement();
	
	
	
}
