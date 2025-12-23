import {Component, OnInit} from '@angular/core';
import {ProductService} from '../services/product';
import {Product} from '../Models/product.model';
import {ActivatedRoute, Router} from '@angular/router';
import {FormsModule} from '@angular/forms';

@Component({
  selector: 'app-update-product',
  imports: [
    FormsModule
  ],
  templateUrl: './update-product.html',
  styleUrl: './update-product.css',
})
export class UpdateProduct implements OnInit {
  currentProduct: Product = new Product();

  constructor(private router: Router, private activateRoute: ActivatedRoute, private productService: ProductService) {
  }

  ngOnInit() {
    this.currentProduct = this.productService.getProduct(this.activateRoute.snapshot.params['id'])
  }

  updateProduct() {
    this.productService.updateProduct(this.currentProduct)
    this.router.navigate(['/products']);
  }
}
