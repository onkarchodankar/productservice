package dev.onkar.productservice.services;

import dev.onkar.productservice.dtos.GenericProductDto;
import dev.onkar.productservice.models.Product;
import org.springframework.stereotype.Service;

@Service("selfProductServiceImpl")
public class SelfProductServiceImpl implements ProductService {

    @Override
    public GenericProductDto getProductById(Long id) {

        return null;
    }

    public GenericProductDto createProduct(GenericProductDto product) {
        return null;
    }
}
