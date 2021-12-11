import {Injectable} from '@angular/core';
import {BehaviorSubject} from "rxjs";
import {FoodService} from "./food.service";

@Injectable({
  providedIn: 'root'
})
export class CartService {


  constructor(private foodService:FoodService) {
  }

}
