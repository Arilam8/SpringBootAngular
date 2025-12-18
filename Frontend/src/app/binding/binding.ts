import { Component } from '@angular/core';
import {FormsModule} from '@angular/forms';

@Component({
  selector: 'app-binding',
  imports: [FormsModule],
  templateUrl: './binding.html',
  styles: ``,
})
export class Binding {
  name: string = "Aristide LAMBERT";
}
