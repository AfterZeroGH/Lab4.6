package com.example.nanicum;

import java.util.Collections;
import java.util.List;

public class CheckLisNote extends Note {
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
    public void getSummary(){
        String  AllItems = "" ;
    }






}
