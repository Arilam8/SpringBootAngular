package be.aristide.springbootangular.Services;
import java.util.List;

public interface Service<T> {
    T save(T model);
    T update(T model);
    void delete(T model);
    void deleteById(Long id);
    T get(Long id);
    List<T> get();
}
