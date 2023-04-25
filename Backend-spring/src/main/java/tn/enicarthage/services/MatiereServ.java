package tn.enicarthage.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.enicarthage.entities.Matiere;
import tn.enicarthage.repositories.MatiereRepo;

@Service
public class MatiereServ implements IMatiereServ {
	@Autowired
	MatiereRepo matiereRepository;
	@Override
	public Matiere addMatiere(Matiere c) {
		
		return matiereRepository.save(c);
	}

	@Override
	public Matiere updateMatiere(Matiere c) {
		// TODO Auto-generated method stub
		return matiereRepository.save(c);
	}

	@Override
	public void deleteMatiere(Matiere c) {
		matiereRepository.delete(c);
		
	}

	@Override
	public void deleteMatieretById(String id) {
		matiereRepository.deleteById(id);
		
	}

	@Override
	public Matiere getMatiereById(String id) {
		// TODO Auto-generated method stub
		return matiereRepository.findById(id).get() ;
	}

	@Override
	public List<Matiere> getAllMatiere() {
		// TODO Auto-generated method stub
		return matiereRepository.findAll();
	}



	
}
