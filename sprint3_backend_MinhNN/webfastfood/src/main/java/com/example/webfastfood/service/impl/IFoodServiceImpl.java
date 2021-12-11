package com.example.webfastfood.service.impl;

import com.example.webfastfood.entity.food.Category;
import com.example.webfastfood.entity.food.Food;
import com.example.webfastfood.repository.IFoodRepository;
import com.example.webfastfood.service.IFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IFoodServiceImpl implements IFoodService {
    @Autowired
    private IFoodRepository iFoodRepository;

    @Override
    public List<Food> getListFood() {
        return iFoodRepository.getListFood();
    }

    @Override
    public List<Food> searchListFood( String foodName, String categoryName) {
        return iFoodRepository.searchListFood( foodName, categoryName);
    }

    @Override
    public Food getFoodById(Integer foodId) {
        return iFoodRepository.getFoodById(foodId);
    }

}
