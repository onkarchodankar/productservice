package dev.onkar.productservice.repositories;

import dev.onkar.productservice.models.Product;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
import java.util.function.Function;

@Repository
public interface ProductRepository
extends JpaRepository<Product, UUID> {

    Product findByTitleEquals(String title);

     Product findByTitleEqualsAndPrice_Price (String title, double price);

    List<Product> findAllByPrice_Currency(String currency);


    long countAllByPrice_Currency(String currency);

    List<Product> findAllByTitleLike(String titleRegex);

    List<Product> readAllByTitleLike(String titleRegex);

    @Query(value = "select * from product join product_orders "
            +"on product.id = product_orders.product_id where title = :naman", nativeQuery = true)
    List<Product> findAllByTitle(String naman);

}
