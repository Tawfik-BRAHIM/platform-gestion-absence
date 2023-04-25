package tn.enicarthage.services;

import tn.enicarthage.entities.Admin;

public interface IAdminServ {

		public Admin authentificate(String login,String password);
		public void logOut(String cin);
		
		public Admin addAministrator(Admin administrator);
		public Admin updateAministrator(Admin administrator);
		public void deleteAdministrator(long cin);
		public Admin getAdministratorByCin(long cin);
}
