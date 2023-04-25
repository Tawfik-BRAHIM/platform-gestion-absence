package tn.enicarthage.services;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import tn.enicarthage.entities.Admin;
import tn.enicarthage.repositories.AdminRepo;

@Service
public class AdminServ implements IAdminServ {

	@Autowired
	AdminRepo adminrep;

	@Override
	public Admin authentificate(String login, String password) {
		Admin admin=adminrep.findByEmail(login);
		if(admin!=null) {
			if(admin.getPassword().equals(password)) {
				admin.setIsActif(1);
				adminrep.save(admin);
				return admin;
			}
		}
		return null;
	}

	@Override
	public void logOut(String login) {
		Admin admin =adminrep.findByEmail(login);
		if(admin!=null) {
			admin.setIsActif(0);
			adminrep.save(admin);
		}
		
	}

	@Override
	public Admin addAministrator(Admin administrator) {
		// TODO Auto-generated method stub
		return adminrep.save(administrator);
	}

	@Override
	public Admin updateAministrator(Admin administrator) {
		// TODO Auto-generated method stub
		return adminrep.save(administrator);
	}

	@Override
	public void deleteAdministrator(long id) {
		// TODO Auto-generated method stub
		adminrep.deleteById(id);
	}

	@Override
	public Admin getAdministratorByCin(long cin) {
		// TODO Auto-generated method stub
		return adminrep.findById(cin).get();
	}
	


}
