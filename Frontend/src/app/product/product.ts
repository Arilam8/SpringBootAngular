import {Component, OnInit} from '@angular/core';
import { Product as P } from '../Models/product.model';
import {DatePipe} from '@angular/common';
import {ProductService} from '../services/product';

@Component({
  selector: 'app-product',
  imports: [
    DatePipe
  ],
  templateUrl: './product.html',
  styleUrl: './product.css',
})
export class Product implements OnInit {
  products: P[];

  constructor(private productService: ProductService) {
    this.products = [];
  }

  ngOnInit(): void {
    this.products = this.productService.getProducts();
  }
}
