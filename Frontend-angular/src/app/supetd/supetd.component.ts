import { Component } from '@angular/core';

@Component({
  selector: 'app-supetd',
  templateUrl: './supetd.component.html',
  styleUrls: ['./supetd.component.scss']
})
export class SupetdComponent {
  etudiants = [
    {nom: 'Rihem', prenom: 'Smiri', email: 'smiri.rihem@example.com', cin: '12345678'},
    {nom: 'Yessine', prenom: 'sahnoun', email: 'sahnoun.yessine@example.com', cin: '23456789'},
    {nom: 'Maryem', prenom: 'trabelsi', email: 'pmaryem@example.com', cin: '34567890'},
    {nom: 'Garcia', prenom: 'Maria', email: 'maria.gracia@example.com', cin: '12345678'},
    {nom: 'Oussema', prenom: 'bh', email: 'ouss@example.com', cin: '23456789'},
    {nom: 'lee', prenom: 'jin', email: 'leejin@example.com', cin: '34567890'},
  ];

  supprimerEtudiant(etudiant: any) {
    const index = this.etudiants.indexOf(etudiant);
    if (index !== -1) {
      this.etudiants.splice(index, 1);
    }
  }
}
