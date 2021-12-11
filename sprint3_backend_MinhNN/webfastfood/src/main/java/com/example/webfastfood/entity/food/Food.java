package com.example.webfastfood.entity.food;




import com.example.webfastfood.entity.oders.OrderDetail;
import com.fasterxml.jackson.annotation.JsonBackReference;
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
public class Food implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer foodId;
    private String foodName;
    private String foodImage;
    private boolean deleteFlag;
    private double foodPrice;
    private String dateCreate;


    @ManyToOne(targetEntity = Category.class)
    @JoinColumn(name = "category_id", referencedColumnName = "categoryId")
    private Category category;

    @JsonBackReference
    @OneToMany(mappedBy = "food")
    private List<OrderDetail> orderDetails;
}
