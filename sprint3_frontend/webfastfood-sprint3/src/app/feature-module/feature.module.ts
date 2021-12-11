import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AccountModule } from './account/account.module';
import {ShareModule} from '../share-module/share.module';
import { OrderModule } from './order/order.module';
import {CustomerModule} from "./customer/customer.module";
import {FoodModule} from "./food/food.module";
import { HomeBodyComponent } from './home-body/home-body.component';
import {HomeModule} from "./home-body/home.module";
import {BrowserModule} from "@angular/platform-browser";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {Ng2OrderModule} from "ng2-order-pipe";
import { SortPipe } from './sort.pipe';





@NgModule({
  declarations: [HomeBodyComponent, SortPipe],
    imports: [
        BrowserModule,
        CommonModule,
        AccountModule,
        OrderModule,
        CustomerModule,
        FoodModule,
        HomeModule,
        ReactiveFormsModule,
        Ng2OrderModule,
        FormsModule

    ],
  exports: [
    AccountModule,
    ShareModule,
    OrderModule,
    OrderModule,
    CustomerModule,
    FoodModule,
    HomeModule
  ]
})
export class FeatureModule { }
