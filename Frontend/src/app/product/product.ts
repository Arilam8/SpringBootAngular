import {Component, OnInit} from '@angular/core';
import { Product as P } from '../Models/product.model';
import {DatePipe} from '@angular/common';
import {ProductService} from '../services/product';
import {RouterLink} from '@angular/router';

@Component({
  selector: 'app-product',
  imports: [
    DatePipe,
    RouterLink
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

  deleteProduct(product: P) {
    let conf = confirm('Are you sure ?');
    if (conf) {
      this.productService.deleteProduct(product)
    }
  }
}
