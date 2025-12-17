package be.aristide.springbootangular;

import be.aristide.springbootangular.Models.Products;
import be.aristide.springbootangular.Repos.ProductsRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class SpringBootAngularApplicationTests {

    @Autowired
    private ProductsRepository productsRepository;

    @Test
    public void testCreateProduct(){
        Products products = new Products("Iphone 16 Pro Max", 1479.0, new Date());
        productsRepository.save(products);
    }

    @Test
    public void testFindProduct(){
        Products products = productsRepository.findById(1L).get();
        System.out.println(products);
    }

    @Test
    public void testUpdateProduct(){
        Products products = productsRepository.findById(1L).get();
        products.setPrice(1000.0);
        productsRepository.save(products);
    }

    @Test
    public void testDeleteProduct(){
        Products products = new Products("Iphone 16 Pro Max", 1479.0, new Date());
        productsRepository.save(products);
        System.out.println(products);
        productsRepository.deleteById(products.getId());
    }

    @Test
    public void testFindAllProduct(){
        List<Products> products = productsRepository.findAll();
        for(Products product : products){
            System.out.println(product);
        }
    }
}
