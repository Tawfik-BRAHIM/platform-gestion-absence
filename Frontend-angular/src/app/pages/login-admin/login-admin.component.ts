import { Component } from '@angular/core';
import { Router } from '@angular/router';
@Component({
  selector: 'app-login-admin',
  templateUrl: './login-admin.component.html',
  styleUrls: ['./login-admin.component.scss']
})
export class LoginAdminComponent {
  constructor(private router: Router) {}

  goToHomePage() {
    this.router.navigate(['/homead'])
  }
}
