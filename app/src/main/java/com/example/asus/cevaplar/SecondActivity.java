package com.example.asus.cevaplar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


/**
 * Created by Asus on 18.7.2017.
 */

public class SecondActivity extends Activity {


    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btn = (Button) this.findViewById(R.id.anladım);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intent);

            }
        });

    }
}
