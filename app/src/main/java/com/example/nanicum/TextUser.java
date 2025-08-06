package com.example.nanicum;

public class TextUser extends  User {
    //Attribute
    public String TextName;
    String TextIDPassword;


    //getter
    public String getTextName() {
        return TextName;
    }
    private  String getTextPassword(String getTextPassword){
        return TextIDPassword ;
    }

    //setter
    public void setTextname(String newTextname){
        this.TextName = newTextname ;
    }
    //Method
    public  void  getName(){
        System.out.print(username+","+"TextIDPassword"+",");
    }

}
