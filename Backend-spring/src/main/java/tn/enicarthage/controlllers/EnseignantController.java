package tn.enicarthage.controlllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import tn.enicarthage.entities.Enseignant;
import tn.enicarthage.entities.Matiere;
import tn.enicarthage.services.EnseignantServ;

import java.util.List;


@RestController
public class EnseignantController {

    @Autowired
    private EnseignantServ ens ;


    @GetMapping("/Enseignant/login/{log}/{pass}")
    public Enseignant LoginEnseignant(@PathVariable("log")String log ,@PathVariable("pass")String pass ) {

        return ens.authentificate(log , pass);

    }


    @GetMapping("/Enseignant/logout/{log}")
    public void logOut(@PathVariable("log")String log) {
        ens.logOut(log);
    }

    @GetMapping("/Enseignant/{id}")
    public Enseignant getEnseignantByCin(@PathVariable("id") Long id) {
        return ens.getEnseignantByCin(id);
    }

    @PostMapping("/Enseignant/AjouterEnseignant")
    public Enseignant addEnseignant(@RequestBody Enseignant en) {
        return ens.addEnseignant(en);
    }

    @PutMapping("/Enseignant/{id}")
    public Enseignant updateEnseignant( @PathVariable("id") Long id,@RequestBody Enseignant en) {
        en.setId(id);
        return ens.updateEnseignant(en);
    }

    @DeleteMapping("/Enseignant")
    public void deleteEnseignant( Enseignant en) {
        ens.deleteEnseignant(en);
    }

}

