import { Component } from '@angular/core';

@Component({
  selector: 'app-elidep',
  templateUrl: './elidep.component.html',
  styleUrls: ['./elidep.component.scss']
})
export class ElidepComponent {
  depChoisi = '';
  etudiants = [
    {nom: 'Mohamed', prenom: 'Kchaw', email: 'kchaw.mohamed@example.com', cin: '12345678', departement: 'Informatique', elimine: true},
    {nom: 'Ahmed', prenom: 'Bouali', email: 'bouali.ahmed@example.com', cin: '23456789', departement: 'Electrique', elimine: false},
    {nom: 'Majdi', prenom: 'Trabelsi', email:'trabelsi.majdi@example.com', cin: '34567890', departement: 'Génie Industriel', elimine: false},
    {nom: 'Sana', prenom: 'Aloui', email: 'aloui.sana@example.com', cin: '45678901', departement: 'Informatique', elimine: true},
    {nom: 'Basma', prenom: 'Tayari', email: 'tayari.basma@example.com', cin: '56789012', departement: 'Génie Industriel', elimine: false},
    ];

    filtrerEtudiants() {
    if (this.depChoisi === 'Informatique') {
    return this.etudiants.filter(e => e.departement === 'Informatique');
    } else if (this.depChoisi === 'Génie Industriel') {
    return this.etudiants.filter(e => e.departement === 'Génie Industriel');
    } else if (this.depChoisi === 'Electrique') {
    return this.etudiants.filter(e => e.departement === 'Electrique');
    } else {
    return this.etudiants;
    }

  }}
