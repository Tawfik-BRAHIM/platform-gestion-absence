import { Component } from '@angular/core';
import { Router } from '@angular/router';

interface Menu {
  id: string;
  titre: string;
  icon: string;
  url: string;
}

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.scss']
})
export class MenuComponent {
  public menuProprities: Array<Menu> = [
    {
      id: '1',
      titre: 'Espace etudiant',
      icon: 'fa-solid fa-bars',
      url:'login'
    },
    {
      id: '2',
      titre: 'Espace enseignant',
      icon: 'fa-solid fa-bars',
      url:'login-en'
    },
    {
      id: '3',
      titre: 'Espace admin',
      icon: 'fa-solid fa-bars',
      url:'login-admin'
    }
  ];
  constructor(
    private router : Router
  ) {}
  ngOnInit() : void {}
  navigate(url?: string) : void{
    this.router.navigate([url]);
  }
}


