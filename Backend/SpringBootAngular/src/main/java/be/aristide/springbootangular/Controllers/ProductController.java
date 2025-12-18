package be.aristide.springbootangular.Controllers;

import be.aristide.springbootangular.Models.Product;
import be.aristide.springbootangular.Services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@CrossOrigin
@AllArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/get/all")
    public List<Product> getAllProducts() {
        return productService.get();
    }

    @GetMapping("/get/{id}")
    public Product getProductById(@PathVariable("id") Long id) {
        return productService.get(id);
    }

    @PostMapping("/create")
    public Product createProduct(@RequestBody Product product) {
        return productService.save(product);
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product) {
        return productService.update(product);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteById(id);
    }

    @GetMapping("category/{id}")
    public List<Product> getProductsByCategory(@PathVariable Long id) {
        return productService.findByCategory_Id(id);
    }
}
