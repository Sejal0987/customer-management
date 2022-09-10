import {Component} from '@angular/core';
import {SocialAuthService} from 'angularx-social-login';
import {Router} from '@angular/router';
import { Inject } from '@angular/core';
@Component({
  selector: 'app-main-page',
  templateUrl: './main-page.component.html',
  styleUrls: ['./main-page.component.css']
})
export class MainPageComponent {

  constructor(@Inject(Router) private router: Router,
  @Inject(SocialAuthService) public socialAuthServive: SocialAuthService) {
  }
  clickable:boolean=false

  logout(): void {
    this.socialAuthServive.signOut().then(() => this.router.navigate(['login']));
  }

}
