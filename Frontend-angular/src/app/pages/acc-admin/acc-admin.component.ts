import { Component } from '@angular/core';
import { Router } from '@angular/router';
interface admin {
  id: string;
  url: string;
}
@Component({
  selector: 'app-acc-admin',
  templateUrl: './acc-admin.component.html',
  styleUrls: ['./acc-admin.component.scss']
})

export class AccAdminComponent {

  constructor(private router: Router) {}

  goToHomePage() {
    this.router.navigate(['/homead'])
  }

}
