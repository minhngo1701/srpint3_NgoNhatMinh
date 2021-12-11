package com.example.webfastfood.repository;

import com.example.webfastfood.entity.food.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface ICategoryRepository extends JpaRepository<Category, Integer> {
    @Query(value = "SELECT category_id,category_name\n" +
            "FROM category", nativeQuery = true)
    List<Category> getCategory();
}
