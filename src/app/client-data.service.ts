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
  baseUrl2 = "http://localhost:5000/turfs/";

  getAllTurfs():Observable<Array<Turf>>{
    return this._http.get<Array<Turf>>(this.baseUrl);
  }
  updateAllTurfs(turfs:Array<Turf>){
    console.log(turfs);
    return this._http.post<Array<Turf>>(this.baseUrl2,turfs);
  }

}
