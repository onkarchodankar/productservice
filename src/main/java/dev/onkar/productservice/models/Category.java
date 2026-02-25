package dev.onkar.productservice.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Category extends BaseModel{
    private String name;

    @OneToMany( mappedBy = "category")
    private List<Product> products = new ArrayList<>();
    // this is the same relation being mapped by category attribute in the other(Product) class

// class Group {
// m:m
// List<User> : members;
// m:m
// List <User> : admin;
//
// 1 ---> 1
//  m ---> 1
//  m:1
//  User creaor;
//
// }

}
