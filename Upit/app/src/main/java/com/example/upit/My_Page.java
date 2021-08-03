package com.example.upit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class My_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_page);

        ImageButton historybutton = findViewById(R.id.imageButton4);
        historybutton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), Purchase_history.class);
                startActivity(intent1);

            }
        });
        ImageButton cartbutton = findViewById(R.id.imageButton3);
        cartbutton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(), Shopping_cart.class);
                startActivity(intent2);

            }
        });
        ImageButton likebutton = findViewById(R.id.imageButton5);
        likebutton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(getApplicationContext(), Like.class);
                startActivity(intent3);

            }
        });
        ImageButton membershipbutton = findViewById(R.id.imageButton6);
        membershipbutton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(getApplicationContext(), Membershipnew.class);
                startActivity(intent4);

            }
        });

        ImageButton mileagebutton = findViewById(R.id.usermileage);
        mileagebutton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(getApplicationContext(), My_Point.class);
                startActivity(intent5);

            }
        });

    }
}