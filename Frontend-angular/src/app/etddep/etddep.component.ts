import { Component } from '@angular/core';

@Component({
  selector: 'app-etddep',
  templateUrl: './etddep.component.html',
  styleUrls: ['./etddep.component.scss']
})
export class EtddepComponent {
  selectedDepartment = 'informatique';

  etudiants = [
    {nom: 'Sahnoun', prenom: 'Yessine', email: 'sahnoun.yessine@mail.com', cin: '1234567890', departement: 'informatique'},
    {nom: 'Smiri', prenom: 'Rihem', email: 'Smiri.rihem@mail.com', cin: '2345678901', departement: 'genieIndustriel'},
    {nom: 'Garcia', prenom: 'Maria', email: 'maria.garcia@mail.com', cin: '3456789012', departement: 'electrique'},
    {nom: 'Smiri', prenom: 'Rihem', email: 'smiri.rihem@mail.com', cin: '4567890123', departement: 'informatique'},
    {nom: 'Smith', prenom: 'Jane', email: 'jane.smith@mail.com', cin: '5678901234', departement: 'genieIndustriel'},
    {nom: 'Lee', prenom: 'Jin', email: 'jin.lee@mail.com', cin: '6789012345', departement: 'electrique'},
  ];
}
