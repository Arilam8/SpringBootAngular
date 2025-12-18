package be.aristide.springbootangular.Repos;


import be.aristide.springbootangular.Models.Category;
import be.aristide.springbootangular.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(path = "auto")
public interface ProductsRepository extends JpaRepository<Product, Long> {
    List<Product> findByName(String name);
    List<Product> findByNameContains(String name);
    @Query("SELECT p FROM Product p WHERE p.name LIKE %:name AND p.price > :price")
    List<Product> findByNamePrice(@Param("name") String name, @Param("price") Double price);
    @Query("SELECT p FROM Product p WHERE p.category = :category")
    List<Product> findByCategory(@Param("category") Category category);
    List<Product> findByCategory_Id(Long categoryId);
    List<Product> findByOrderByNameAsc();
    @Query("SELECT p FROM Product p ORDER BY p.name ASC, p.price ASC")
    List<Product> orderByNamePrice();
}
