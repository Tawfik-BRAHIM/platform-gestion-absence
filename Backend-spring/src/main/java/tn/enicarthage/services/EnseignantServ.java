package tn.enicarthage.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import tn.enicarthage.entities.Enseignant;
import tn.enicarthage.repositories.EnseignantRepo;

import java.util.List;

@Service
public class EnseignantServ implements IEnseignantServ {
	@Autowired
	EnseignantRepo ensrep;
	@Override
	public Enseignant authentificate(String login, String password) {
		// TODO Auto-generated method stub
		Enseignant ens=ensrep.findByEmail(login);
		if(ens!=null) {
			if(ens.getPassword().equals(password)) {
				ens.setIsActif(1);
				ensrep.save(ens);
				return ens;
			}
		}
		return null;
	}

	@Override
	public void logOut(String login) {
		// TODO Auto-generated method stub
		Enseignant admin =ensrep.findByEmail(login);
		if(admin!=null) {
			admin.setIsActif(0);
			ensrep.save(admin);
		}
	}

	@Override
	public Enseignant addEnseignant(Enseignant ens) {
		// TODO Auto-generated method stub
		return ensrep.save(ens);
	}

	@Override
	public Enseignant updateEnseignant(Enseignant ens) {
		// TODO Auto-generated method stub
		return ensrep.save(ens);
	}

	@Override
	public void deleteEnseignant(Enseignant ens) {
		// TODO Auto-generated method stub
		ensrep.delete(ens);
	}

	@Override
	public Enseignant getEnseignantByCin(long cin) {
		// TODO Auto-generated method stub
		return ensrep.findById(cin).get();
	}





}
