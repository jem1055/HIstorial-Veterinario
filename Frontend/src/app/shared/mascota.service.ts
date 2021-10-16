import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class mascotasService {
  private API_SERVER = "http://localhost:8080/mascota/";

  constructor(private httpClient: HttpClient) { }


  public getAllmascotas(): Observable<any>{
    return this.httpClient.get(this.API_SERVER);
    
  }

}
