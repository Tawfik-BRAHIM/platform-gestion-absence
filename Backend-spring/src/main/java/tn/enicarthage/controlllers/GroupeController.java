package tn.enicarthage.controlllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.enicarthage.entities.Groupe;
import tn.enicarthage.services.GroupeServ;

import java.util.List;
@RestController
public class GroupeController {
    @Autowired
    private GroupeServ groupesServ;

    @GetMapping("/groupes")
    public List<Groupe> getAllGroupes() {
        return groupesServ.getAllGroupe();
    }

    @GetMapping("/groupes/{id}")
    public Groupe getGroupeById(@PathVariable("id") String id) {
        return groupesServ.getGroupeById(id);
    }

    @PostMapping("/groupes/AjouterGroupe")
    public Groupe addGroupe(@RequestBody Groupe g) {
        return groupesServ.addGroupe(g);
    }

    @PutMapping("/groupes/{id}")
    public Groupe updateGroupe(@PathVariable("id") String id, @RequestBody Groupe g) {
        //departement.setNomDepart(id);
        return groupesServ.updateGroupe(g);
    }

    @DeleteMapping("/groupes/{id}")
    public void deleteGroupeById(@PathVariable("id") String id) {
        groupesServ.deleteGroupeById(id);
    }

}
