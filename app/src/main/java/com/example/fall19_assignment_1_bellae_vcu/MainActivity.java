package com.example.fall19_assignment_1_bellae_vcu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private final int CONFIG_REQUEST = 123;
    private Boolean unlock = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button unlock = (Button) findViewById(R.id.unlock);
        unlock.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivityForResult(intent, CONFIG_REQUEST);
            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == CONFIG_REQUEST) {
            if (resultCode == RESULT_OK) {
                unlock =  data.getExtras().getBoolean("unlock");
                TextView welcome = findViewById(R.id.welcome);
                if(unlock) {
                    welcome.setText(getString(R.string.welcomeunlock));
                }
                else {
                    welcome.setText(getString(R.string.welcomelock));
                }
            }
        }
    }



}
