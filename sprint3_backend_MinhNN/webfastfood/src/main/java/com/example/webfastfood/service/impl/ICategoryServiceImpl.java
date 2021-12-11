package com.example.webfastfood.service.impl;

import com.example.webfastfood.entity.food.Category;
import com.example.webfastfood.repository.ICategoryRepository;
import com.example.webfastfood.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ICategoryServiceImpl implements ICategoryService {

    @Autowired
    private ICategoryRepository iCategoryRepository;
    @Override
    public List<Category> getAllCategory() {
        return iCategoryRepository.getCategory();
    }
}
