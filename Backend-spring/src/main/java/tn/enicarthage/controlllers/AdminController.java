package tn.enicarthage.controlllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.enicarthage.entities.Admin;
import tn.enicarthage.services.AdminServ;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class AdminController {


    @Autowired
    private AdminServ add ;


    @GetMapping("/Admin/login/{log}/{pass}")
    public Admin LoginAdmin(@PathVariable("log")String log ,@PathVariable("pass")String pass )  {

        return add.authentificate(log , pass);

    }


    @GetMapping("/Admin/logout/{log}")
    public void LogoutAdmin(@PathVariable("log")String log ) {
        add.logOut(log);}

    @GetMapping("/Admin/{id}")
    public Admin getAdministratorByCin(@PathVariable("id") long id) {
        return add.getAdministratorByCin(id);
    }

    @PostMapping("/Admin/AjouterAdmin")
    public Admin addAministrator(@RequestBody Admin en) {
        return add.addAministrator(en);
    }

    @PutMapping("/Admin/{id}")
    public Admin updateAministrator(@PathVariable("id") long id, @RequestBody Admin en) {
        en.setCin(id);
        return add.updateAministrator(en);
    }

    @DeleteMapping("/Admin/{id}")
    public void deleteAdministrator( @PathVariable("id") long id) {
        add.deleteAdministrator(id);
    }

}