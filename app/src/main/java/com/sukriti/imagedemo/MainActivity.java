package com.sukriti.imagedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView suku;
    Button a;
    Button b;
    Button c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        suku = findViewById(R.id.suku);
        a = findViewById(R.id.a);
        b = findViewById(R.id.b);
        c = findViewById(R.id.c);


        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suku.setImageResource(R.drawable.a);
                //Animation a1 = AnimationUtils.loadAnimation(MainActivity.this, android.R.anim.);
                //suku.startAnimation(a1);
                Toast.makeText(MainActivity.this, "Sukriti Kakar", Toast.LENGTH_SHORT).show();
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suku.setImageResource(R.drawable.b);
                //Animation b1 = AnimationUtils.loadAnimation(MainActivity.this, android.R.anim.slide_out_right);
                //suku.startAnimation(b1);
                Toast.makeText(MainActivity.this, "Steve Jobs", Toast.LENGTH_SHORT).show();
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suku.setImageResource(R.drawable.c);
                //Animation c1 = AnimationUtils.loadAnimation(MainActivity.this, android.R.anim.slide_out_right);
                //suku.startAnimation(c1);
                Toast.makeText(MainActivity.this, "Prakriti Kakar", Toast.LENGTH_SHORT).show();
            }
        });



    }
}
