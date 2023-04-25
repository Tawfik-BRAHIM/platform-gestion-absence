import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginPageComponent } from './pages/login-page/login-page.component';
import { PageDashboardComponent } from './pages/page-dashboard/page-dashboard.component';
import { MenuComponent } from './composants/menu/menu.component';
import { LoginEnComponent } from './pages/login-en/login-en.component';
import { HeaderComponent } from './composants/header/header.component';
import { EtudiantComponent } from './pages/etudiant/etudiant.component';
import { EnseignatComponent } from './pages/enseignat/enseignat.component';
import { LoginAdminComponent } from './pages/login-admin/login-admin.component';
import { AccEtudiantComponent } from './pages/acc-etudiant/acc-etudiant.component';
import { AccEnseignatComponent } from './pages/acc-enseignat/acc-enseignat.component';
import { AccAdminComponent } from './pages/acc-admin/acc-admin.component';
import { AbsParGrpComponent } from './pages/abs-par-grp/abs-par-grp.component';
import { AjoutabsComponent } from './pages/ajoutabs/ajoutabs.component';
import { SupabsComponent } from './pages/supabs/supabs.component';
import { MatensComponent } from './matens/matens.component';
import { GrpensComponent } from './grpens/grpens.component';
import { AffichabsComponent } from './affichabs/affichabs.component';
import { AfficheliComponent } from './afficheli/afficheli.component';
import { EtddepComponent } from './etddep/etddep.component';
import { EtdgrpComponent } from './etdgrp/etdgrp.component';
import { SupetdComponent } from './supetd/supetd.component';
import { ModetdComponent } from './modetd/modetd.component';
import { AjoutetdComponent } from './ajoutetd/ajoutetd.component';
import { EligrpComponent } from './eligrp/eligrp.component';
import { ElidepComponent } from './elidep/elidep.component';
import { LogoutComponent } from './pages/logout/logout.component';


@NgModule({
  declarations: [
    AppComponent,
    LoginPageComponent,
    PageDashboardComponent,
    MenuComponent,
    LoginEnComponent,
    HeaderComponent,
    EtudiantComponent,
    EnseignatComponent,
    LoginAdminComponent,
    AccEtudiantComponent,
    AccEnseignatComponent,
    AccAdminComponent,
    AbsParGrpComponent,
    AjoutabsComponent,
    SupabsComponent,
    MatensComponent,
    GrpensComponent,
    AffichabsComponent,
    AfficheliComponent,
    EtddepComponent,
    EtdgrpComponent,
    SupetdComponent,
    ModetdComponent,
    AjoutetdComponent,
    EligrpComponent,
    ElidepComponent,
    LogoutComponent,


  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
