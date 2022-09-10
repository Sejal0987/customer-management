import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-booking',
  templateUrl: './booking.component.html',
  styleUrls: ['./booking.component.css']
})
export class BookingComponent implements OnInit {
  @Input()name:string|null='';
  turf1={
    name:'Four Lions Academy and Turf',
    address:' New airport road Near dorabjee mall, behind elite tennis academy, Viman Nagar, Pune, Maharashtra 411032',
    img:'https://playo.gumlet.io/4LIONSACADEMYVIMANNAGAR20220517130011577316/4LionsAcademyVimanNagar1652793126930.jpg?auto=compress,format&h=300'
  }
  turf2={
    name:'Mundhwa Turf Ground',
    address:'BG Shirke Rd, Somnath Nagar, Kirtane Baug, Mundhwa Industrial Area, Mundhwa, Pune, Maharashtra 411036',
    img:'https://content3.jdmagicbox.com/comp/def_content/football-turf-grounds/hf3n7csp0i-football-turf-grounds-5-qootk.jpg'
  }
  turf3={
    name:'Turf Up',
    address:'Sr No.38/C NIBM Annex Opp Raheja Vista Phase 3, Cloud 9 Road, Pune, Maharashtra 411048',
    img:'https://content3.jdmagicbox.com/comp/pune/j1/020pxx20.xx20.180605120034.u9j1/catalogue/turf-up-kharadi-pune-restaurants-1xlnizfnl7.jpg?clr=333333'
  }
  constructor(private route: ActivatedRoute) {

  }
  ngOnInit(){
    this.route.paramMap.subscribe( params =>
        this.name = params.get('name')
    )
  }

}
