import { Component } from '@angular/core';
interface Etudiant {
  nom: string;
  prenom: string;
  email: string;
  cin: string;
  groupe: string;
}

@Component({
  selector: 'app-etdgrp',
  templateUrl: './etdgrp.component.html',
  styleUrls: ['./etdgrp.component.scss']
})
export class EtdgrpComponent {

  selectedGroupe: string = 'GroupeA';

  etudiants = [
    {nom: 'Sahnoun', prenom: 'Yessine', email: 'sahnoun.yessine@mail.com', cin: '1234567890', departement: 'informatique',groupe:'GroupeA'},
    {nom: 'Smiri', prenom: 'Rihem', email: 'Smiri.rihem@mail.com', cin: '2345678901', departement: 'genieIndustriel',groupe:'GroupeA'},
    {nom: 'Garcia', prenom: 'Maria', email: 'maria.garcia@mail.com', cin: '3456789012', departement: 'electrique',groupe:'GroupeA'},
    
    {nom: 'Smith', prenom: 'Jane', email: 'jane.smith@mail.com', cin: '5678901234', departement: 'genieIndustriel',groupe:'GroupeA'},
    {nom: 'Lee', prenom: 'Jin', email: 'jin.lee@mail.com', cin: '6789012345', departement: 'electrique',groupe:'GroupeA'},
  ];
}
