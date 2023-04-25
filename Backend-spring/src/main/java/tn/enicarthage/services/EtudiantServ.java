package tn.enicarthage.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import tn.enicarthage.entities.Etudiant;
import tn.enicarthage.repositories.EtudiantRepo;

@Service
public class EtudiantServ implements IEtudiantServ {
	@Autowired
	EtudiantRepo etdrep;
	@Override
	public Etudiant authentificate(String login, String password) {
		Etudiant admin=etdrep.findByEmail(login);
		if(admin!=null) {
			if(admin.getPassword().equals(password)) {
				admin.setIsActif(1);
				etdrep.save(admin);
				return admin;
			}
		}
		return null;
	}

	@Override
	public void logOut(String login) {
		// TODO Auto-generated method stub
		Etudiant admin =etdrep.findByEmail(login);
		if(admin!=null) {
			admin.setIsActif(0);
			etdrep.save(admin);
		}
	}

	@Override
	public Etudiant addEtudiant(Etudiant member) {
		// TODO Auto-generated method stub
		return etdrep.save(member);
	}

	@Override
	public Etudiant updateEtudiant(Etudiant member) {
		// TODO Auto-generated method stub
		return etdrep.save(member);
	}

	@Override
	public void deleteEtudiant(long cin) {
		// TODO Auto-generated method stub
	 etdrep.deleteById(cin);
	}

	@Override
	public Etudiant getEtudiantByCin(long cin) {
		// TODO Auto-generated method stub
		return etdrep.findById(cin).get() ;
	}

	@Override
	public List<Etudiant> getEtudiantByNameAndFirstname(String name, String firsname) {
		// TODO Auto-generated method stub
		return etdrep.findEtudiantByNameAndSurname(name, firsname) ;
	}

	@Override
	public Etudiant getEtudiantByEmail(String email) {
		// TODO Auto-generated method stub
		return etdrep.findByEmail(email) ;
	}

	@Override
	public List<Etudiant> getAllEtudiant() {
		// TODO Auto-generated method stub
		return etdrep.findAll();
	}

	@Override
	public List<Etudiant> getEtudiantByIdGroupe(String id) {
		// TODO Auto-generated method stub
		return etdrep.findEtudiantByIdGroupe(id);
	}

	@Override
	public List<Etudiant> getEtudiantEleminieParGrpAndMAt(String matId, String groupeId) {
		return etdrep.findEtudiantsWithExceededAbsences(matId,groupeId);
	}


}
