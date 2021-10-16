import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { HistoriaClinicaComponent } from './historia/historiaClinica.component';
import { DetalleComponent } from './detalle/detalle.component';


const routes: Routes = [
  { path: '', component : HomeComponent},
  { path: 'historia', component : HistoriaClinicaComponent},
  { path: 'detalles', component : DetalleComponent}
 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
