package be.aristide.springbootangular.Services;

import be.aristide.springbootangular.Models.Products;
import be.aristide.springbootangular.Repos.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@org.springframework.stereotype.Service
public class ProductsService implements Service<Products> {
    private final ProductsRepository productsRepository;

    public ProductsService(ProductsRepository productsRepository){
        super();
        this.productsRepository = productsRepository;
    }

    @Override
    public Products save(Products model) {
        return productsRepository.save(model);
    }

    @Override
    public Products update(Products model) {
        return save(model);
    }

    @Override
    public void delete(Products model) {
        productsRepository.delete(model);
    }

    @Override
    public void deleteById(Long id) {
        productsRepository.deleteById(id);
    }

    @Override
    public Products get(Long id) {
        return productsRepository.findById(id).get();
    }

    @Override
    public List<Products> get() {
        return productsRepository.findAll();
    }
}
