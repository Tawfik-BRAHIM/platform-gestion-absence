package tn.enicarthage.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.enicarthage.entities.EnumDep;
import tn.enicarthage.entities.Groupe;
import tn.enicarthage.repositories.GroupeRepo;

@Service
public class GroupeServ implements IGroupeServ {

	@Autowired
	GroupeRepo grprep;
	@Override
	public Groupe addGroupe(Groupe c) {
		return grprep.save(c);
		
	}

	@Override
	public Groupe updateGroupe(Groupe c) {
		// TODO Auto-generated method stub
		return grprep.save(c);
	}

	@Override
	public void deleteGroupe(Groupe c) {
		grprep.delete(c);
		
	}

	@Override
	public void deleteGroupeById(String id) {
		grprep.deleteById(id);
		
	}

	@Override
	public Groupe getGroupeById(String id) {
		return grprep.findById(id).get();
	}

	@Override
	public List<Groupe>
	getAllGroupe() {
		// TODO Auto-generated method stub
		return grprep.findAll();
	}



	


}
