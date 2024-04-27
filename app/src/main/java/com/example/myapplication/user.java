package com.example.myapplication;

public class user {
    private String phone_number, username, password;

    public user(){

    }

    //конструктор для всех переменных
    public user (String phone_number, String username, String password){
        this.password = password;
        this.phone_number = phone_number;
        this.username = username;
    }
    // метод получения переменных
    public String getUsername(){
        return username;
    }
    //установка
    public void setUsername(String username){
        this.username = username;
    }

    public String getPhone_number(){
        return phone_number;
    }

    public void setPhone_number(String phone_number){
        this.phone_number = phone_number;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }
}

