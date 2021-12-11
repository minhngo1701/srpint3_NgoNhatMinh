import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {HttpClientModule} from '@angular/common/http';
import { ShareModule } from './share-module/share.module';
import { FeatureModule } from './feature-module/feature.module';
import { AppRoutingModule } from './app-routing.module';
import {HomeModule} from "./feature-module/home-body/home.module";
import {HomeBodyComponent} from "./feature-module/home-body/home-body.component";
import {CommonModule} from "@angular/common";

@NgModule({
  declarations: [
    AppComponent,
  ],
  imports: [
    CommonModule,
    BrowserModule,
    BrowserAnimationsModule,
    HttpClientModule,
    ShareModule,
    FeatureModule,
    AppRoutingModule,
    HomeModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
