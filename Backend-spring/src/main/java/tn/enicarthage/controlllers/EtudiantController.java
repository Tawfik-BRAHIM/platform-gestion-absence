package tn.enicarthage.controlllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import tn.enicarthage.entities.Absence;
import tn.enicarthage.entities.Etudiant;
import tn.enicarthage.entities.Matiere;
import tn.enicarthage.services.EtudiantServ;

import java.util.List;

@RestController
public class EtudiantController {
    @Autowired
    private EtudiantServ etdServ;

    @GetMapping("/etudiant")
    public List<Etudiant> getAllEtudiant() {
        return etdServ.getAllEtudiant();
    }

    @GetMapping("/etudiant/login/{log}/{pass}")
    public Etudiant LoginEtd(@PathVariable("log")String log ,@PathVariable("pass")String pass ) {
        return etdServ.authentificate(log,pass);}

    @GetMapping("/etudiant/logout/{log}")
    public void LogoutEtd(@PathVariable("log")String log ) {
         etdServ.logOut(log);}
    @PostMapping("/etudiant/AjouterEtudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant etd) {
        return etdServ.addEtudiant(etd);
    }
    @GetMapping("/etudiant/{id}")
    public Etudiant getEtudiantById(@PathVariable("id") long id) {
        return etdServ.getEtudiantByCin(id);
    }
    @PutMapping("/etudiant/{id}")
    public Etudiant updateEtudiant(@PathVariable("id") long id, @RequestBody Etudiant etd) {
        etd.setId(id);
        return etdServ.updateEtudiant(etd);
    }

    @DeleteMapping("/etudiant/{id}")
    public void deleteEtudiantById(@PathVariable("id") long id) {
        etdServ.deleteEtudiant(id);
    }

    @GetMapping("/etudiant/group/{id}")
    public List<Etudiant> getEtudiantByGroup(@PathVariable("id") String id) {
        return etdServ.getEtudiantByIdGroupe(id);
    }

    @GetMapping("/etudiant/group/mat/{idg}/{idm}")
    public List<Etudiant> getEtudiantElemineByGroupAndMat(@PathVariable("idm") String idm,@PathVariable("idg") String idg) {
        return etdServ.getEtudiantEleminieParGrpAndMAt(idm,idg);
    }

}
