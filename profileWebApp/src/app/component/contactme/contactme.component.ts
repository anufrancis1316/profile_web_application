import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, FormsModule, Validators } from '@angular/forms';

@Component({
  selector: 'app-contactme',
  imports: [FormsModule],
  templateUrl: './contactme.component.html',
  styleUrl: './contactme.component.css'
})
export class ContactmeComponent{
  contact = {
    name: '',
    email: '',
    message: ''
  };

  // Handle form submission
  onSubmit() {
    console.log('Form Submitted:', this.contact);
  }

}
