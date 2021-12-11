import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AccountRoutingModule } from './account-routing.module';
import {ShareModule} from '../../share-module/share.module';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {AccountComponent} from "./account.component";

@NgModule({
  declarations: [AccountComponent],
  imports: [
    CommonModule,
    AccountRoutingModule,
    ShareModule,
    ReactiveFormsModule,
    FormsModule
  ],
})
export class AccountModule { }
