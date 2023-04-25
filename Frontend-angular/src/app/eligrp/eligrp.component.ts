import { Component } from '@angular/core';

@Component({
  selector: 'app-eligrp',
  templateUrl: './eligrp.component.html',
  styleUrls: ['./eligrp.component.scss']
})
export class EligrpComponent {
  groupeChoisi = '';
  etudiants = [
    {nom: 'Rihem', prenom: 'Smiri', email: 'smiri.rihem@example.com', cin: '12345678', elimine: true},
    {nom: 'Yessine', prenom: 'sahnoun', email: 'sahnoun.yessine@example.com', cin: '23456789', elimine: false},
    {nom: 'Maryem', prenom: 'trabelsi', email: 'pmaryem@example.com', cin: '34567890', elimine: false},
    {nom: 'Oussema', prenom: 'bh', email: 'ouss@example.com', cin: '45678901', elimine: true},
    {nom: 'lee', prenom: 'jin', email: 'leejin@example.com', cin: '56789012', elimine: false},
  ];

  filtrerEtudiants() {
    if (this.groupeChoisi === 'GROUPE A') {
      return this.etudiants.filter(e => e.elimine === false);
    } else if (this.groupeChoisi === 'GROUPE B') {
      return this.etudiants.filter(e => e.elimine === true);
    } else if (this.groupeChoisi === 'GROUPE C') {
      return this.etudiants.filter(e => e.nom.startsWith('M'));
    } else if (this.groupeChoisi === 'GROUPE D') {
      return this.etudiants.filter(e => e.prenom.length > 5);
    } else {
      return this.etudiants;
    }
  }
}
