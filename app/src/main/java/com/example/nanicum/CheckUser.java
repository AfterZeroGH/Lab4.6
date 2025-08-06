package com.example.nanicum;

import java.util.List;

public class CheckUser extends  User{
    //Attribute
    private List<String> IdPassword ;

    //getter
    private  List<String> getIdPassword() {
        return IdPassword ;
    }

    //setter
    private  void  setIdPassword(List<String> newIdPassword) {
        this.IdPassword = newIdPassword ;
    }

    //method
    public String getSummary(){
        return  username+":("+IdPassword+")";
    }

}
