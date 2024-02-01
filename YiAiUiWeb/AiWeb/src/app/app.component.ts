import {Component, Inject} from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Logger } from 'logger.service';
@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {

  constructor(@Inject() private logger: Logger) { }
  fontColor = 'blue';
  sayHelloId = 1;
  canClick = false;
  message = 'Hello, World';
  count = 0;

  onLogMe() {
    this.logger.writeCount(this.count);
    this.count++;
  }



  sayMessage() {
    alert(this.message);
  }

}
