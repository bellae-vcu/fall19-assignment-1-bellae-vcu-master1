package com.example.fall19_assignment_1_bellae_vcu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    int count = 0;
    int[] array = {0,0,0,0};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button one = (Button) findViewById(R.id.one);
        Button two = (Button) findViewById(R.id.two);
        Button three = (Button) findViewById(R.id.three);
        Button four = (Button) findViewById(R.id.four);
        Button submit = (Button) findViewById(R.id.submit);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                array[count] = 1;
                if (count <4){
                count = count +1;}
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                array[count] = 2;
                if (count <4){
                    count = count +1;}
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                array[count] = 3;
                if (count <4){
                    count = count +1;}
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                array[count] = 4;
                if (count <4){
                    count = count +1;}
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Boolean unlock = false;
                if(array[0] == 1 && array[1] == 2 && array[2] == 3 && array[3] == 4) {
                    unlock = true;
                }

                Intent intent = new Intent();
                intent.putExtra("unlock", unlock);
                setResult(RESULT_OK, intent);
                finish();

            }
        });



    }



}
