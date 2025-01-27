import { Component } from '@angular/core';
import { RouterLink, RouterOutlet } from '@angular/router';
import {MatTabsModule} from '@angular/material/tabs';


@Component({
  selector: 'app-root',
  imports: [RouterOutlet,RouterLink,MatTabsModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'profileWebApp';
}
