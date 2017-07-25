package com.example.asus.cevaplar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by Asus on 18.7.2017.
 */

public class ThirdActivity extends Activity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);


        text = (TextView) findViewById(R.id.tv);

        String[] array = text.getResources().getStringArray(R.array.cevap);
        String texti = array[new Random().nextInt(array.length)];

        text.setText(String.valueOf(texti));


    }
}
