package tn.enicarthage.controlllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.enicarthage.entities.Absence;
import tn.enicarthage.entities.Matiere;
import tn.enicarthage.services.AbsenceServ;
import tn.enicarthage.services.MatiereServ;

import java.util.List;

@RestController
public class AbsenceController {
    @Autowired
    private AbsenceServ absServ;

    @GetMapping("/absence")
    public List<Absence> getAllAbsence() {
        return absServ.getAllAbsences();
    }



    @PostMapping("/matieres/AjouterAbsence")
    public Absence addMatiere(@RequestBody Absence absence) {
        return absServ.addAbsence(absence);
    }

    @PutMapping("/absence/{id}")
    public Absence updateAbsence(@PathVariable("id") String id, @RequestBody Absence absence) {
        //departement.setNomDepart(id);
        return absServ.updateAbsence(absence);
    }

    @DeleteMapping("/absence/{id}")
    public void deleteAbsenceById(@PathVariable("id") String id) {
        absServ.deleteAbsenceById(id);
    }
    @GetMapping("/absence/{ide}/{idm}")
    public List<Object[]> nbAbsence(@PathVariable("ide") long ide, @PathVariable("idm") String idm) {
        return absServ.getNombreAbsencesParMatiere( ide,idm);}


    @GetMapping("/absence/group/{idg}/{idm}")
    public List<Object[]> nbAbsenceGroup(@PathVariable("idg") String idg, @PathVariable("idm") String idm) {
        return absServ.getNombreAbsencesParMatiereForGroup( idg,idm);}
}
