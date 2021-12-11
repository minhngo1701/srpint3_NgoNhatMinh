package com.example.webfastfood.repository;

import com.example.webfastfood.entity.food.Category;
import com.example.webfastfood.entity.food.Food;
import org.hibernate.cache.spi.entry.StructuredCacheEntry;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface IFoodRepository extends JpaRepository<Food, Integer> {

    @Query(value = "SELECT f.food_id,f.food_name,f.food_image,f.food_price,f.delete_flag,f.date_create,f.category_id\n" +
            "FROM food f\n" +
            "JOIN category c ON c.category_id = f.category_id\n" +
            "WHERE f.delete_flag = false",nativeQuery = true)
    List<Food> getListFood();

    @Query(value = "SELECT f.food_id,f.food_name,f.food_image,f.food_price,f.delete_flag,f.date_create,f.category_id\n" +
            "FROM food f\n" +
            "JOIN category c ON c.category_id = f.category_id\n" +
            "WHERE f.delete_flag = false AND (?1 IS NULL OR f.food_name LIKE %?1%) " +
            "AND (?2 IS NULL OR c.category_name LIKE %?2%)",
            countQuery = "SELECT COUNT(*)\n" +
                    "FROM food\n" +
                    "JOIN category ON category.category_id = food.category_id\n" +
                    "WHERE delete_flag = false AND (?1 IS NULL OR food.food_name LIKE %?1%) " +
                    "AND (?2 IS NULL OR category.category_name LIKE %?2%)",
            nativeQuery = true)
    List<Food> searchListFood(String foodName,String categoryName);

    @Query(value = "SELECT f.food_id,f.food_name,f.food_image,f.food_price,f.delete_flag,f.category_id\n" +
            "FROM food f\n" +
            "JOIN category v on c.category_id = f.category_id\n" +
            "WHERE f.delete_flag = false and f.food_id = ?1 ", nativeQuery = true)
    Food getFoodById(Integer foodId);


}
