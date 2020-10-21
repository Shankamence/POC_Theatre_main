package com.example.poctheatre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    ViewFlipper viewFlipper;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int images [] = {R.drawable.dk, R.drawable.inception, R.drawable.jl};
        viewFlipper = findViewById(R.id.flipper);

        for(int image: images)
        {
            flipperImages(image);
        }

       TextView textView = (TextView) findViewById(R.id.textView3);
        textView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Movies_List.class);
                startActivity(intent);

            }
        });

            ImageView iv1 = (ImageView) findViewById(R.id.img1);
            iv1.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PayAct.class);
                startActivity(intent);
                }

            });
        ImageView iv2 = (ImageView) findViewById(R.id.img2);
        iv2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PayAct.class);
                startActivity(intent);
            }

        });
        ImageView iv3 = (ImageView) findViewById(R.id.img3);
        iv3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PayAct.class);
                startActivity(intent);
            }

        });
        ImageView iv4 = (ImageView) findViewById(R.id.img4);
        iv4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PayAct.class);
                startActivity(intent);
            }

        });
        ImageView iv5 = (ImageView) findViewById(R.id.img5);
        iv5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PayAct.class);
                startActivity(intent);
            }

        });
    }
    public void flipperImages(int image)
    {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(3000); //3sec
        viewFlipper.setAutoStart(true);

        viewFlipper.setInAnimation(this,android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(this,android.R.anim.slide_out_right);





    }
}