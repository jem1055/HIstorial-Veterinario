import { Component, OnInit,Input, SimpleChanges, OnChanges } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { detalleService } from '../shared/detalle.service';
import { mascotasService } from '../shared/mascota.service';
import { UsuarioService } from '../shared/usuario.service';
import { historiaService } from '../shared/historia.service';
import { colaboradorService } from '../shared/colaborador.service';

@Component({
  selector: 'app-detalle',
  templateUrl: './detalle.component.html',
  styleUrls: ['./detalle.component.css']
})
export class DetalleComponent implements OnInit {

  
  detalleForm: FormGroup;
  usuarios: any;
  mascotas: any;
  historias: any;
  detalles: any;
  colaboradores: any;

  @Input() recibidoDePadre: string;
  constructor(
    public fb: FormBuilder,
    public detalleSevice: detalleService,
    public mascotasService: mascotasService,
    public usuarioService: UsuarioService,
    public historiaService: historiaService,
    public colaboradorService: colaboradorService,
  ) {
  }

 

  ngOnInit(): void {

    this.detalleForm = this.fb.group({
    id: [''],
    temperatura: ['', Validators.required],
		peso: ['', Validators.required],
		frecuencia_cardiaca: ['', Validators.required],
		frecuencia_respiratoria: ['', Validators.required],
		fecha_hora: ['', Validators.required],
		alimentacion: ['', Validators.required],
		habitad: ['', Validators.required],
		observacion: ['', Validators.required],
		id_colaborador : ['', Validators.required],
		id_historia_clinica: ['', Validators.required],
      
    });;

    this.detalleSevice.getAllDetalle().subscribe(resp => {
      this.detalles = resp;
    },
      error => { console.error(error) }
    );

    this.historiaService.getAllhistorias().subscribe(resp => {
      this.historias = resp;
    },
      error => { console.error(error) }
    );

   
      this.mascotasService.getAllmascotas().subscribe(resp => {
        this.mascotas = resp;
       
      },
        error => { console.error(error) }
      );

      this.colaboradorService.getAllColaborador().subscribe(resp => {
        this.colaboradores = resp;
       
      },
        error => { console.error(error) }
      );

  }


  guardar(): void {
    this.detalleSevice.saveDetalle(this.detalleForm.value).subscribe(resp => {
      this.detalleForm.reset();
      this.detalles=this.detalles.filter(detalles=> resp.id!==detalles.id);
      this.detalles.push(resp);
    },
      error => { console.error(error) }
    )
  }

  eliminar(detalle){
    this.detalleSevice.deleteDetalle(detalle.id).subscribe(resp=>{
      if(resp===true){
        this.detalles.pop(detalle)
        
      }
      
    })
  }

  editar(detalle){
    this.detalleForm.setValue({
    id: detalle.id,
    temperatura: detalle.temperatura,
		peso:detalle.peso ,
		frecuencia_cardiaca: detalle.frecuencia_cardiaca ,
		frecuencia_respiratoria: detalle.frecuencia_respiratoria ,
		fecha_hora: detalle.fecha_hora,
		alimentacion: detalle.alimentacion,
		habitad: detalle.habitad,
		observacion: detalle.observacion,
		id_colaborador : detalle.id_colaborador,
		id_historia_clinica: detalle.id_historia_clinica,
     })
  }



}
