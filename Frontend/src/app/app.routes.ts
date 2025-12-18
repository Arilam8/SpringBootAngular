import { Routes } from '@angular/router';
import {Product} from './product/product';
import {AddProduct} from './add-product/add-product';

export const routes: Routes = [
  {path: "products", component : Product},
  {path: "add-product", component : AddProduct},
  {path: "", redirectTo: 'products', pathMatch: 'full'},
];
