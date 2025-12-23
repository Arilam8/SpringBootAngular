import { Routes } from '@angular/router';
import {Product} from './product/product';
import {AddProduct} from './add-product/add-product';
import {UpdateProduct} from './update-product/update-product';

export const routes: Routes = [
  {path: "products", component : Product},
  {path: "add-product", component : AddProduct},
  {path: "update-product/:id", component : UpdateProduct},
  {path: "", redirectTo: 'products', pathMatch: 'full'},
];
