import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { Observable } from 'rxjs';
import { Turf } from './Turf';


@Injectable({
  providedIn: 'root'
})
export class ClientDataService {

  constructor(private _http:HttpClient) { }
  baseUrl = "http://localhost:5000/turf/";

  getAllTurfs():Observable<Array<Turf>>{
    return this._http.get<Array<Turf>>(this.baseUrl);
  }

}
