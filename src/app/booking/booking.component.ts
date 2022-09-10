import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-booking',
  templateUrl: './booking.component.html',
  styleUrls: ['./booking.component.css']
})
export class BookingComponent implements OnInit {
  @Input()name:string|null='';
  constructor(private route: ActivatedRoute) {

  }
  ngOnInit(){
    this.route.paramMap.subscribe( params =>
        this.name = params.get('name')
    )
  }

}
