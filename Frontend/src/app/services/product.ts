import { Injectable } from '@angular/core';
import { Product } from '../Models/product.model';

@Injectable({
  providedIn: 'root',
})
export class ProductService {
  products: Product[];

  constructor() {
    this.products = [
      {id : 1, name: "Iphone", price: 1479.0, date: new Date("08/02/2025")},
      {id : 2, name: "Ipad", price: 1400.0, date: new Date("08/03/2024")},
      {id : 3, name: "PlayStation 5 Pro", price: 799.0, date: new Date("08/02/2020")}
    ];
  }

  getProducts(): Product[] {
    return this.products;
  }

  addProduct(product: Product) {
    this.products.push(product);
  }

  deleteProduct(product: Product) {
    const index = this.products.indexOf(product);
    if (index >= 0) {
      this.products.splice(index, 1);
    }
  }

  getProduct(id: number): Product {
    let product = this.products.find((product) => product.id == id);
    if (product == null) {
      return new Product();
    }
    return product;
  }

  updateProduct(product: Product) {
    const index = this.products.indexOf(product);
    if (index >= 0) {
      this.products.splice(index, 1);
      this.products.splice(index, 0, product);
    }
  }
}
