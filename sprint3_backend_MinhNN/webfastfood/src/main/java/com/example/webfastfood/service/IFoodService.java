package com.example.webfastfood.service;

import com.example.webfastfood.entity.food.Category;
import com.example.webfastfood.entity.food.Food;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface IFoodService {
    List<Food> getListFood();
    List<Food> searchListFood(String foodName,String categoryName);
    Food getFoodById(Integer foodId);
}
