import {Component, OnInit} from '@angular/core';
import {FormsModule} from '@angular/forms';
import {Product} from '../Models/product.model';
import {ProductService} from '../services/product';

@Component({
  selector: 'app-add-product',
  imports: [FormsModule],
  templateUrl: './add-product.html',
  styleUrl: './add-product.css',
})
export class AddProduct implements OnInit {
    newProduct = new Product();
    message: string = "";

    constructor(private productService: ProductService) {

    }

    ngOnInit(): void {

    }

    addProduct(): void {
      this.productService.addProduct(this.newProduct);
      this.message = 'Add Product Successfully';
    }

}
