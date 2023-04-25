package tn.enicarthage.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.enicarthage.entities.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Long> {
	Admin findByEmail(String email);

}
