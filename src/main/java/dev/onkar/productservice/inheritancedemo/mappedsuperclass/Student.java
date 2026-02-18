package dev.onkar.productservice.inheritancedemo.mappedsuperclass;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityResult;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "ms_student")
public class Student extends User{
    private double psp;
    private double attendance;
}
