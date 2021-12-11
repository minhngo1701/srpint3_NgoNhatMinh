package com.example.webcafe.entity.oders;



import com.example.webcafe.entity.food.Food;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderDetail implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long orderFoodId;
    private Integer quantityFood;

    @ManyToOne
    @JoinColumn(name = "orders_id",referencedColumnName = "ordersId")
    private Orders orders;

    @ManyToOne
    @JoinColumn(name = "food_id", referencedColumnName = "foodId")
    private Food food;
}
