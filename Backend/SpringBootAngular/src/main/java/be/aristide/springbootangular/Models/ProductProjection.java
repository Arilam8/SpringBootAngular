package be.aristide.springbootangular.Models;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "Name", types = {Product.class})
public interface ProductProjection {
    public String getName();
}
