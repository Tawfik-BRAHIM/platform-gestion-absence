import { Component } from '@angular/core';
import { Router } from '@angular/router';



@Component({
  selector: 'app-acc-etudiant',
  templateUrl: './acc-etudiant.component.html',
  styleUrls: ['./acc-etudiant.component.scss']
})
export class AccEtudiantComponent {
  constructor(private router: Router) {}

  goToHomePage() {
    this.router.navigate(['/homeetd'])
  }
  logout() {
    // Ajouter le code de déconnexion ici
    this.router.navigate(['/homeetd']); // Naviguer vers la page de connexion
  }

}
