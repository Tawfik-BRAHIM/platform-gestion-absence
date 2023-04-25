import { Component } from '@angular/core';
import { Router } from '@angular/router';
@Component({
  selector: 'app-login-en',
  templateUrl: './login-en.component.html',
  styleUrls: ['./login-en.component.scss']
})
export class LoginEnComponent {
  constructor(private router: Router) {};
  goToHomePage(): void {
    this.router.navigate(['/homeens']);
  }
}
