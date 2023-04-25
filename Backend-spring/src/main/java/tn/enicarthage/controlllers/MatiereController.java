package tn.enicarthage.controlllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.enicarthage.entities.Departement;
import tn.enicarthage.entities.EnumDep;
import tn.enicarthage.entities.Matiere;
import tn.enicarthage.services.DepartementServ;
import tn.enicarthage.services.MatiereServ;

import java.util.List;

@RestController
public class MatiereController {
    @Autowired
    private MatiereServ matServ;

    @GetMapping("/matieres")
    public List<Matiere> getAllMatiere() {
        return matServ.getAllMatiere();
    }

    @GetMapping("/matieres/{id}")
    public Matiere getMatiereById(@PathVariable("id") String id) {
        return matServ.getMatiereById(id);
    }

    @PostMapping("/matieres/AjouterMatiere")
    public Matiere addMatiere(@RequestBody Matiere matiere) {
        return matServ.addMatiere(matiere);
    }

    @PutMapping("/matieres/{id}")
    public Matiere updateMatiere(@PathVariable("id") String id, @RequestBody Matiere matiere) {
        //departement.setNomDepart(id);
        return matServ.updateMatiere(matiere);
    }

    @DeleteMapping("/matieres/{id}")
    public void deleteMatiereById(@PathVariable("id") String id) {
        matServ.deleteMatieretById(id);
    }



}
