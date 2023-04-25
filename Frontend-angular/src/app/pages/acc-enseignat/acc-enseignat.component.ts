import { Component } from '@angular/core';
import { Router } from '@angular/router';
@Component({
  selector: 'app-acc-enseignat',
  templateUrl: './acc-enseignat.component.html',
  styleUrls: ['./acc-enseignat.component.scss']
})
export class AccEnseignatComponent {
  constructor(private router: Router) {}

  goToHomePage() {
    this.router.navigate(['/homeens'])
  }
}
