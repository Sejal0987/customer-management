import { Component, Input, OnInit } from '@angular/core';
import { ClientDataService } from 'app/client-data.service';
import { Turf } from 'app/Turf';

@Component({
  selector: 'app-turf',
  templateUrl: './turf.component.html',
  styleUrls: ['./turf.component.css']
})
export class TurfComponent implements OnInit {
  @Input()data:any;
  num:number=0;
  constructor(public _turfClient:ClientDataService) {

  }
  turfList:Array<Turf>=[];

  fetchData(){
    this._turfClient.getAllTurfs().subscribe(
      data=>{
        this.turfList=data;
        console.log(data);
      }
    )
  }
  ngOnInit(): void {
  this.fetchData();
  console.log(this.turfList);



  }

}
