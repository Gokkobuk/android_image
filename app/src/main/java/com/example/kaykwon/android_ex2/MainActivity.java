package com.example.kaykwon.android_ex2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView1;
    ImageView imageView2;

    int index = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       imageView1 =  findViewById(R.id.imageView1);
       imageView2 = findViewById(R.id.imageView2);

    }

    public void onButton1Clicked(View v){
        index += 1;
        if(index >1 ){
            index = 0;
        }

        if(index == 0)
        {
            imageView1.setVisibility(View.VISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
        } else if (index ==1)
        {
            imageView1.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.VISIBLE);

        }
    }
}
