import {ICategory} from './ICategory';
import {IOrderDetail} from './IOrderDetail';

export interface IFood {
  foodId: number;
  foodName: string;
  foodImage: string;
  foodPrice: number;
  deleteFlag: boolean;
  dateCreate: String;
  category: ICategory;
  orderDetails: IOrderDetail[];


}
