package com.example.upit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Membershipnew extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_membershipnew);

        Button morebutton = findViewById(R.id.morebutton);
        morebutton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), Membership.class);
                startActivity(intent1);

            }
        });

        ImageButton signbutton = findViewById(R.id.imageButton2);
        signbutton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), MembershipJoin.class);
                startActivity(intent1);

            }
        });
    }
}