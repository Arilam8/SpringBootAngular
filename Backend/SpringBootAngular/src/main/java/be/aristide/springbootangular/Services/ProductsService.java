package be.aristide.springbootangular.Services;

import be.aristide.springbootangular.Models.Category;
import be.aristide.springbootangular.Models.Product;
import be.aristide.springbootangular.Repos.ProductsRepository;

import java.util.List;

@org.springframework.stereotype.Service
public class ProductsService implements Service<Product> {
    private final ProductsRepository productsRepository;

    public ProductsService(ProductsRepository productsRepository){
        super();
        this.productsRepository = productsRepository;
    }

    @Override
    public Product save(Product model) {
        return productsRepository.save(model);
    }

    @Override
    public Product update(Product model) {
        return save(model);
    }

    @Override
    public void delete(Product model) {
        productsRepository.delete(model);
    }

    @Override
    public void deleteById(Long id) {
        productsRepository.deleteById(id);
    }

    @Override
    public Product get(Long id) {
        return productsRepository.findById(id).get();
    }

    @Override
    public List<Product> get() {
        return productsRepository.findAll();
    }

    public List<Product> findByName(String name){
        return productsRepository.findByName(name);
    }

    public List<Product> findByNameContains(String name){
        return productsRepository.findByNameContains(name);
    }

    public List<Product> findByNamePrice(String name, Double price){
        return productsRepository.findByNamePrice(name, price);
    }

    public List<Product> findByCategory(Category category){
        return productsRepository.findByCategory(category);
    }

    public List<Product> findByCategory_Id(Long id){
        return productsRepository.findByCategory_Id(id);
    }

    public List<Product> findByOrderByNameAsc(){
        return productsRepository.findByOrderByNameAsc();
    }

    public List<Product> orderByNamePrice(){
        return productsRepository.orderByNamePrice();
    }
}
