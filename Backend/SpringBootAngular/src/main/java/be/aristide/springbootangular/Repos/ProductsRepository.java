package be.aristide.springbootangular.Repos;


import be.aristide.springbootangular.Models.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Products, Long> {

}
