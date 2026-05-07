package dev.onkar.productservice.dtos;

import dev.onkar.productservice.models.Category;
import dev.onkar.productservice.models.Price;
import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto {
    private String title;

    private String description;

    private String image;
    // P : C
    // => L to R: 1 : 1
    // => R to L: m : 1
    // => ans m : 1


    private Price price;
}
