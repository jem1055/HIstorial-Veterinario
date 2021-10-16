import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class colaboradorService {

  private API_SERVER = "http://localhost:8080/colaborador/";

  constructor(
    private httpClient: HttpClient
  ) { }


  public getAllColaborador(): Observable<any>{
    return this.httpClient.get(this.API_SERVER);
  }

}
