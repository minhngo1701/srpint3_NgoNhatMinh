import { Component, OnInit } from '@angular/core';
import {FoodService} from "../../core-module/food/food.service";
import {IFood} from "../../entity/IFood";
import {FormControl, FormGroup} from "@angular/forms";
import {SnackbarService} from "../../core-module/snackbar/snackbar.service";
import localeVn from "@angular/common/locales/vi";
import {registerLocaleData} from "@angular/common";
registerLocaleData(localeVn, 'vi')

@Component({
  selector: 'app-home-body',
  templateUrl: './home-body.component.html',
  styleUrls: ['./home-body.component.css']
})
export class HomeBodyComponent implements OnInit {

  sortPrice : String = "";
  sortDateCreate: String = "";
  searchForm: FormGroup = new FormGroup({
    foodName: new FormControl(""),
    categoryName: new FormControl("")
  });
  foods: IFood[];
  constructor(private foodService: FoodService,private snackbarService: SnackbarService) { }

  ngOnInit(): void {
    this.searchFood();
    // this.getFood();
  }

  getFood() {
    this.foodService.getListFood().subscribe(next=> {
        this.foods = next;
        console.log(next);
    })
  }

  searchFood(){
    this.foodService.searchFood(this.searchForm.value.foodName, this.searchForm.value.categoryName).subscribe(data=>{
      this.foods = data;
      console.log(data);
    },error => {
      this.snackbarService.showSnackbar("Không tìm thấy món ăn", "error")
    })
  }

  sortDirect() {
    if (this.sortDateCreate === 'desc') {
      this.sortDateCreate = 'asc';
    } else {
      this.sortDateCreate = 'desc';
    }
  }
}
