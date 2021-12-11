import {IFood} from "./IFood";
import {IOrders} from "./IOrders";

export interface IOrderDetail {
  orders: IOrders;
  food: IFood;
  quantity: number;
}
