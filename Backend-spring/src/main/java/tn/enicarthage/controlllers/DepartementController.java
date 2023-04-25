package tn.enicarthage.controlllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.enicarthage.entities.Departement;
import tn.enicarthage.entities.EnumDep;
import tn.enicarthage.services.DepartementServ;

@RestController

public class DepartementController {

    @Autowired
    private DepartementServ departementServ;

    @GetMapping("/departements")
    public List<Departement> getAllDepartements() {
        return departementServ.getAllDepartement();
    }

    @GetMapping("/departements/{id}")
    public Departement getDepartementById(@PathVariable("id") EnumDep id) {
        return departementServ.getDepartementById(id);
    }

    @PostMapping("/departements/AjouterDepartement")
    public Departement addDepartement(@RequestBody Departement departement) {
        return departementServ.addDepartement(departement);
    }

    @PutMapping("/departements/{id}")
    public Departement updateDepartement(@PathVariable("id") EnumDep id, @RequestBody Departement departement) {
    	//departement.setNomDepart(id);
        return departementServ.updateDepartement(departement);
    }

    @DeleteMapping("/departements/{id}")
    public void deleteDepartementById(@PathVariable("id") EnumDep id) {
        departementServ.deleteDepartementById(id);
    }
}
