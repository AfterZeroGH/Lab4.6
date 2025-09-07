package com.example.lab05;

import java.util.List;

public class CheckUser {
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
        String username = "";
        return  username+":("+IdPassword+")";
    }
}
