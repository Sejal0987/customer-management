import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-turf',
  templateUrl: './turf.component.html',
  styleUrls: ['./turf.component.css']
})
export class TurfComponent implements OnInit {
  @Input()data:any;
  constructor() { }

  ngOnInit(): void {
  }

}
