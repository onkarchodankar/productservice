package dev.onkar.productservice.services;

import dev.onkar.productservice.dtos.GenericProductDto;
import dev.onkar.productservice.models.Product;

public interface ProductService {

    GenericProductDto createProduct(GenericProductDto product);

    GenericProductDto getProductById(Long id);

}
