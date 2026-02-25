package dev.onkar.productservice.repositories;

import dev.onkar.productservice.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CategoryRepository
extends JpaRepository<Category, UUID> {

}
