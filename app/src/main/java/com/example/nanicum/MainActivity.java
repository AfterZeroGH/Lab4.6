package com.example.nanicum;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public static void main(String[] args) {
        //Note Note1 = new Note();
        //Note Note2 = new Note();
        User User1 = new User();
        User User2 = new User();

        //Note1.title = "หนังสือ";
        //Note1.content = "Text0";
        //Note1.createdDate = "12/10/2556";

           TextNote textNote1 = new TextNote();
           textNote1.title = "";
           textNote1.createdDate = "";
/*           textNote1.textContent = "";*/
           textNote1.setTextContent(" ");
           textNote1.createdDate = "";
           textNote1.getSummary();

        User1.username = "PASATA01";
        User1.password = "123456";

        TextUser textUser1 = new TextUser() ;
        textUser1.username = "" ;
        textUser1.password = "" ;
        textUser1.setTextname("");
        textUser1.getName();
        textUser1.getPassword();
    }
}