import { Component } from '@angular/core';

@Component({
  selector: 'app-modetd',
  templateUrl: './modetd.component.html',
  styleUrls: ['./modetd.component.scss']
})
export class ModetdComponent {
  etudiants = [
    {nom: 'Rihem', prenom: 'Smiri', email: 'smiri.rihem@example.com', cin: '12345678'},
    {nom: 'Yessine', prenom: 'sahnoun', email: 'sahnoun.yessine@example.com', cin: '23456789'},
    {nom: 'Maryem', prenom: 'trabelsi', email: 'pmaryem@example.com', cin: '34567890'},
    {nom: 'Garcia', prenom: 'Maria', email: 'maria.gracia@example.com', cin: '12345678'},
    {nom: 'Oussema', prenom: 'bh', email: 'ouss@example.com', cin: '23456789'},
    {nom: 'lee', prenom: 'jin', email: 'leejin@example.com', cin: '34567890'},
    ];
}
