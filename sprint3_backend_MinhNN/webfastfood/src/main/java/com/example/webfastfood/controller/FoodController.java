package com.example.webfastfood.controller;

import com.example.webfastfood.entity.food.Category;
import com.example.webfastfood.entity.food.Food;
import com.example.webfastfood.repository.ICategoryRepository;
import com.example.webfastfood.service.ICategoryService;
import com.example.webfastfood.service.IFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/food")
public class FoodController {
    @Autowired
    private IFoodService iFoodService;
    @Autowired
    private ICategoryService iCategoryService;

    @GetMapping("/list")
    public ResponseEntity<List<Food>> getListFood() {
        List<Food> foods = iFoodService.getListFood();
        if (foods.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(foods, HttpStatus.OK);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Food>> searchFood(
                                                 @RequestParam(required = false) String foodName,
                                                 @RequestParam(required = false) String categoryName) {
        List<Food> foodSearch = iFoodService.searchListFood(foodName,categoryName);
        if (foodSearch.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(foodSearch,HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Food> getFoodById(@PathVariable("id") Integer foodId) {
        Food food = iFoodService.getFoodById(foodId);
        if (food != null) {
            return new ResponseEntity<>(food,HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/category")
    public ResponseEntity<List<Category>> getAllCategory() {
        List<Category> categories = iCategoryService.getAllCategory();
        if (categories.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }
}
