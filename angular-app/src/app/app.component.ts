import { Component, OnInit, ViewChild } from '@angular/core';
import { User, UserComponent } from './user/user.component';
import { UserService } from './user/user.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'angular-app';

  @ViewChild(UserComponent) user: UserComponent;

  constructor( private userService: UserService) {

  }

  ngOnInit() {
    this.userService.getUsers()
      .subscribe(results => {
        console.log('user data results ', results);
        this.user.users = results;
      });
  }
}
