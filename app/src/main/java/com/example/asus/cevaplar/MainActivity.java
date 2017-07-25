package com.example.asus.cevaplar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ad;
    EditText soyad;
    EditText yas;
    EditText soru;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ad = (EditText) findViewById(R.id.ad);
        soyad = (EditText) findViewById(R.id.soyad);
        yas = (EditText) findViewById(R.id.yas);
        soru = (EditText) findViewById(R.id.soru);
        btn = (Button) this.findViewById(R.id.btn);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = ad.getText().toString();
                String surname = soyad.getText().toString();
                String age = yas.getText().toString();
                String question = soru.getText().toString();


                if (v.getId() == btn.getId()) {
                    if (name.length() == 0) {
                        ad.requestFocus();
                        ad.setError("İsim alanı bos bırakılamaz!");
                    } else if (surname.length() == 0) {
                        soyad.requestFocus();
                        soyad.setError("Soyad alanı bos bırakılamaz!");
                    } else if (age.length() == 0) {
                        yas.requestFocus();
                        yas.setError("Yas alanı bos bırakılamaz!");
                    } else if (question.length() == 0) {
                        soru.requestFocus();
                        soru.setError("Soru alanı bos bırakılamaz!");
                    } else {
                        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                        startActivity(intent);

                    }


                }

            }
        });

    }
}
