package com.example.nanicum;

public abstract class  Note {
    // Attributes
    public String title;
    public String createdDate;

    //getter
    public String getTitle(){
        return  title;
    }
    public String getCreatedDate(){
        return createdDate;
    }

    // Method
    abstract void getSummary();
        //System.out.println(title+":"+textContent+"("+createdDate+")")
}
