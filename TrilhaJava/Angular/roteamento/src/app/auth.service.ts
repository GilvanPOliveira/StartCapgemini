import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  acessToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiYWRtaW4iOnRydWUsImlhdCI6MTUxNjIzOTAyMn0.KMUFsIDTnFmyG3nMiGM6H9FNFUROf3wh7SmqJp-QV30";

  constructor() { }

  estaAutenticado(): boolean {
    return !!sessionStorage.getItem("acess-token");
  }

  login(email: string, senha: string): boolean {
    if(email === "admin@admin.com" && senha === "123456") {
      sessionStorage.setItem("acess-token", this.acessToken);
      return true;
    }

    return false;
  }

  logout() {
    sessionStorage.clear();
  }
}
