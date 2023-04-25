package tn.enicarthage.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.enicarthage.entities.Departement;
import tn.enicarthage.entities.EnumDep;

import tn.enicarthage.repositories.DepartementRepo;

@Service
public class DepartementServ implements IDepartementServ {
	@Autowired
	DepartementRepo deprep;
	@Override
	public Departement addDepartement(Departement c) {
		// TODO Auto-generated method stub
		return deprep.save(c);
	}

	@Override
	public Departement updateDepartement(Departement c) {
		// TODO Auto-generated method stub
		return deprep.save(c);
	}

	@Override
	public void deleteDepartement(Departement c) {
		deprep.delete(c);
		
	}

	@Override
	public void deleteDepartementById(EnumDep id) {
		// TODO Auto-generated method stub
		deprep.deleteById(id);
	}

	@Override
	public Departement getDepartementById(EnumDep id) {
		// TODO Auto-generated method stub
		return deprep.findById(id).get();
	}

	@Override
	public List<Departement> getAllDepartement() {
		// TODO Auto-generated method stub
		return deprep.findAll();
	}

	

	

}
