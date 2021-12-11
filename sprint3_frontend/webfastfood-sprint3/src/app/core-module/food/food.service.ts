import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Observable} from "rxjs";
import {IFood} from "../../entity/IFood";
import {StorageService} from "../account/storage.service";
import {ICategory} from "../../entity/ICategory";

@Injectable({
  providedIn: 'root'
})
export class FoodService {
  url = "http://localhost:8080/api/food"
  constructor(private http: HttpClient, private storageService: StorageService) {
    // this.httpOptions = {
    //   headers: new HttpHeaders({ 'Content-Type': 'application/json', 'Authorization': 'DUNG ' + `${this.storageService.getToken()}`
    //   }),
    //   'Access-Control-Allow-Origin': 'http://localhost:4200',
    //   'Access-Control-Allow-Methods': 'GET,PUT,POST,DELETE,PATCH,OPTIONS'
    // }
  }

  getListFood(): Observable<IFood[]|any> {
    return this.http.get(this.url + "/list");
  }

  searchFood(foodName: String, categoryName: String): Observable<IFood[]|any> {
    return this.http.get(this.url + "/search" + "?foodName=" + foodName + "&categoryName=" + categoryName);
  }

  getAllCategory(): Observable<ICategory[]|any> {
    return this.http.get(this.url + "/category");
  }
}
