import { Component } from '@angular/core';
import {NgForOf} from '@angular/common';

@Component({
  selector: 'app-product',
  imports: [
    NgForOf
  ],
  templateUrl: './product.html',
  styleUrl: './product.css',
})
export class Product {
  products: string[];

  constructor() {
    this.products = ["iPhone", "iPad", "iPod"];
  }
}
