import { Component, OnInit } from "@angular/core";
import { FormBuilder, FormGroup, Validators } from "@angular/forms";
import { mascotasService } from "../shared/mascota.service";
import { UsuarioService } from "../shared/usuario.service";
import { historiaService } from "../shared/historia.service";

@Component({
  selector: "app-historia",
  templateUrl: "./historiaClinica.component.html",
  styleUrls: ["./historiaClinica.component.css"],
})
export class HistoriaClinicaComponent implements OnInit {
  historiaForm: FormGroup;
  usuarios: any;
  mascotas: any;
  historias: any;

  constructor(
    public fb: FormBuilder,
    public mascotasService: mascotasService,
    public usuarioService: UsuarioService,
    public historiaService: historiaService
  ) {}
  ngOnInit(): void {
    this.historiaForm = this.fb.group({
      id: [""],
      id_mascota: ["", Validators.required],
      fecha: ["", Validators.required],
    });

    this.usuarioService.getAllUsuarios().subscribe(
      (resp) => {
        this.usuarios = resp;
      },
      (error) => {
        console.error(error);
      }
    );

    this.historiaService.getAllhistorias().subscribe(
      (resp) => {
        this.historias = resp;
      },
      (error) => {
        console.error(error);
      }
    );

    this.mascotasService.getAllmascotas().subscribe(
      (resp) => {
        this.mascotas = resp;
      },
      (error) => {
        console.error(error);
      }
    );
  }

  guardar(): void {
    this.historiaService.savehistoria(this.historiaForm.value).subscribe(
      (resp) => {
        this.historiaForm.reset();
        this.historias = this.historias.filter(
          (historia) => resp.id !== historia.id
        );
        this.historias.push(resp);
      },
      (error) => {
        console.error(error);
      }
    );
  }

  eliminar(historia) {
    this.historiaService.deletehistoria(historia.id).subscribe((resp) => {
      if (resp === true) {
        this.historias.pop(historia);
      }
    });
  }

  editar(historia) {
    this.historiaForm.setValue({
      id: historia.id,
      id_mascota: historia.id_mascota,
      fecha: historia.fecha,
    });
  }
}
