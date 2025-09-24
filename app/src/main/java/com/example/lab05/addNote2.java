package com.example.lab05;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.ContentInfo;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.security.AccessControlContext;
import java.security.AccessController;
import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class
addNote2 extends AppCompatActivity {
        Button addBack;

        Button addButton;
        EditText title,textContent,name;

        TextView display;
        TextView display2;
        TextView display1;
        Button addcheck;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_note2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.imageView), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        
        addBack = findViewById(R.id.back);
        addBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addbackButton = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(addbackButton);
            }
        });

        addButton = findViewById(R.id.button2);
        title = findViewById(R.id.editText);
        textContent = findViewById(R.id.editText2);
        display = findViewById(R.id.textView2);
        display2 = findViewById(R.id.textView4);
        addcheck = findViewById(R.id.button3);
        name = findViewById(R.id.editText);


        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //get data from user (EditText)
                String strOfTitle = title.getText().toString();
                String strOfContent = textContent.getText().toString();

                String strOfDate = new Date().toString();
                String strOfName = name.getText().toString();;

                TextNote note1 = new TextNote();
                note1.setTitle(strOfTitle);
                note1.setTextContent(strOfContent);


                note1.createdDate = strOfDate;
                TextUser user1 = new TextUser();
                user1.setTextname(strOfName);

                display.setText(note1.getSummary());

//                NoteEntity entity = NoteMapper.toEntity(note);
//
//                Context context = view.getContext();
//                Executors.newSingleThreadExecutor().execute(()-> AppDatabase.getInstance(context).noteDao().insert(entity));

            }
        });
        addcheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strOfTitle = title.getText().toString();
                String strOfDate = new Date().toString();

                CheckLisNote note1 = new CheckLisNote();
                note1.setTitle(strOfTitle);

                note1.createdDate = strOfDate;

                display1.setText(note1.getSummary());
            }
        });
    }
}

