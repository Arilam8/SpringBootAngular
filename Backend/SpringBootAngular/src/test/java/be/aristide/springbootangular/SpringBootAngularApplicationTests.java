package be.aristide.springbootangular;

import be.aristide.springbootangular.Models.Category;
import be.aristide.springbootangular.Models.Product;
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
        Product product = new Product("Iphone 16 Pro Max", 1479.0, new Date());
        productsRepository.save(product);
    }

    @Test
    public void testFindProduct(){
        Product product = productsRepository.findById(1L).get();
        System.out.println(product);
    }

    @Test
    public void testUpdateProduct(){
        Product product = productsRepository.findById(1L).get();
        product.setPrice(1000.0);
        productsRepository.save(product);
    }

    @Test
    public void testDeleteProduct(){
        Product product = new Product("Iphone 16 Pro Max", 1479.0, new Date());
        productsRepository.save(product);
        System.out.println(product);
        productsRepository.deleteById(product.getId());
    }

    @Test
    public void testFindAllProduct(){
        List<Product> products = productsRepository.findAll();
        for(Product product : products){
            System.out.println(product);
        }
    }

    @Test
    public void testFindByName(){
        List<Product> products = productsRepository.findByName("Iphone 16 Pro Max");
        for(Product product : products){
            System.out.println(product);
        }
    }

    @Test
    public void testFindByNameContains(){
        List<Product> products = productsRepository.findByNameContains("Iphone");
        for(Product product : products){
            System.out.println(product);
        }
    }

    @Test
    public void testFindByNamePrice(){
        List<Product> products = productsRepository.findByNamePrice("Iphone 16 Pro Max", 1000.0);
        for(Product product : products){
            System.out.println(product);
        }
    }

    @Test
    public void testFindByCategory(){
        Category category = new Category();
        category.setId(1L);
        List<Product> products = productsRepository.findByCategory(category);
        for(Product product : products){
            System.out.println(product);
        }
    }

    @Test
    public void testFindByCategory_Id(){
        List<Product> products = productsRepository.findByCategory_Id(1L);
        for(Product product : products){
            System.out.println(product);
        }
    }

    @Test
    public void testFindByOrderByNameAsc(){
        List<Product> products = productsRepository.findByOrderByNameAsc();
        for(Product product : products){
            System.out.println(product);
        }
    }

    @Test
    public void testOrderByNamePrice(){
        List<Product> products = productsRepository.orderByNamePrice();
        for(Product product : products){
            System.out.println(product);
        }
    }
}
