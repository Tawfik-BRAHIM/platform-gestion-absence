import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginPageComponent } from './pages/login-page/login-page.component';
import { PageDashboardComponent } from './pages/page-dashboard/page-dashboard.component';
import { LoginEnComponent } from './pages/login-en/login-en.component';
import { LoginAdminComponent } from './pages/login-admin/login-admin.component';
import { MatensComponent } from './matens/matens.component';
import { GrpensComponent } from './grpens/grpens.component';
import { AbsParGrpComponent } from './pages/abs-par-grp/abs-par-grp.component';
import { AjoutabsComponent } from './pages/ajoutabs/ajoutabs.component';
import { SupabsComponent } from './pages/supabs/supabs.component';
import { AffichabsComponent } from './affichabs/affichabs.component';
import { AfficheliComponent } from './afficheli/afficheli.component';
import { EtddepComponent } from './etddep/etddep.component';
import { EtdgrpComponent } from './etdgrp/etdgrp.component';
import { SupetdComponent } from './supetd/supetd.component';
import { ModetdComponent } from './modetd/modetd.component';
import { AjoutetdComponent } from './ajoutetd/ajoutetd.component';
import { EligrpComponent } from './eligrp/eligrp.component';
import { ElidepComponent } from './elidep/elidep.component';
import { AccEtudiantComponent } from './pages/acc-etudiant/acc-etudiant.component';
import { LogoutComponent } from './pages/logout/logout.component';
import { AccEnseignatComponent } from './pages/acc-enseignat/acc-enseignat.component';
import { AccAdminComponent } from './pages/acc-admin/acc-admin.component';


const adminRoutes: Routes = [

  { path: 'a', component: EtddepComponent },
  { path: 'b', component: EtdgrpComponent },
  { path: 'c', component: SupetdComponent },
  { path: 'd', component: ModetdComponent },
  { path: 'e', component: AjoutetdComponent },
  { path: 'f', component: EligrpComponent },
  { path: 'g', component: ElidepComponent },
  { path: 'Affichabs', component:AffichabsComponent},
  { path: 'Afficheli', component:AfficheliComponent},
  { path: 'AbsParGrp', component:AbsParGrpComponent},
  { path: 'Ajoutabs', component:AjoutabsComponent},
  { path: 'Supabs', component:SupabsComponent},

  {
    path:'matens',
    component:MatensComponent
  },
  {
    path:'grpens',
    component:GrpensComponent
  }
];

const routes: Routes = [
  {path:'homead',
  component:AccAdminComponent},
  {path:'homeens',
  component:AccEnseignatComponent},
  {path:'logout',
  component:LogoutComponent},
  {path:'homeetd',
  component:AccEtudiantComponent},
{
  path:'',
component:PageDashboardComponent,
children : [
  {
    path:'login',
    component:LoginPageComponent
  },
  {
    path:'login-en',
    component:LoginEnComponent
  },
  {
    path:'login-admin',
    component:LoginAdminComponent}

]
}

];

@NgModule({
  imports: [RouterModule.forRoot(routes), RouterModule.forChild(adminRoutes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
