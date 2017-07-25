package com.example.asus.cevaplar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


/**
 * Created by Asus on 18.7.2017
 */

public class StartActivity extends AppCompatActivity {


    TextView acıklama;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);


        acıklama = (TextView) findViewById(R.id.acıklama);
        btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(StartActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });


    }
}
