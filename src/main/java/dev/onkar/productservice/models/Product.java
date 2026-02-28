package dev.onkar.productservice.models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Cascade;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Product extends BaseModel {
    private String title;
    private String description;
    private String image;
    // P : C
    // => L to R: 1 : 1
    // => R to L: m : 1
    // => ans m : 1
    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "category")
    private Category category;

    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.PERSIST})
    private Price price;
//    private double price;



}
