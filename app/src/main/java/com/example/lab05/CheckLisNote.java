package com.example.lab05;

import java.util.Collections;
import java.util.List;

public class CheckLisNote extends note {
    public String createdDate;
    //Attribute
    private List <String> Items;

    //getter
    public List <String> getItems(){
        return Items;
    }

    //setter
    public  String setItems(String newItems){
        this.Items = Collections.singletonList(newItems);
        return newItems;
    }
    //loop check List <String> Items;


    //Method
    public int getSummary(){
        String  AllItems = "" ;
        return 0;
    }

    public void setTitle(String strOfTitle) {
    }
}