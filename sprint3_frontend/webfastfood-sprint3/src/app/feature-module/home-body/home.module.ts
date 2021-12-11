import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {ShareModule} from "../../share-module/share.module";
import {HomeRoutingModule} from "./home-routing.module";
import {HomeBodyComponent} from "./home-body.component";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {Ng2OrderModule} from "ng2-order-pipe";




@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    HomeRoutingModule,
    ShareModule,
    ReactiveFormsModule,
    FormsModule,
    Ng2OrderModule
  ]
})
export class HomeModule { }
