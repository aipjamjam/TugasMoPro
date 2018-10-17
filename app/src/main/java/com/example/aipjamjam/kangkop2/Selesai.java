package com.example.aipjamjam.kangkop2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Selesai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selesai);
    }

    public void btm(View view) {
        Toast.makeText(Selesai.this,"Terimakasih Atas Kunjugannya",Toast.LENGTH_LONG).show();

        Intent selesai = new Intent(Selesai.this,MainActivity.class);
        startActivity(selesai);
    }
}
