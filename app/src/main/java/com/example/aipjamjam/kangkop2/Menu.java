package com.example.aipjamjam.kangkop2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Menu extends AppCompatActivity {

    TextView total_harga;
    private EditText menu1,menu2,menu3,menu4,menu5,menu6,menu7,menu8;
    int jumlah=0;
    int juma=0,jumb=0,jumc=0,jumd=0,jume=0,jumf=0,jumg=0,jumh=0;
    int a,b,c,d,e,f,g,h;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        menu1=findViewById(R.id.menu1);
        menu2=findViewById(R.id.menu2);
        menu3=findViewById(R.id.menu3);
        menu4=findViewById(R.id.menu4);
        menu5=findViewById(R.id.menu5);
        menu6=findViewById(R.id.menu6);
        menu7=findViewById(R.id.menu7);
        menu8=findViewById(R.id.menu8);
        total_harga=findViewById(R.id.total_harga);

        menu1.setText("0");
        menu2.setText("0");
        menu3.setText("0");
        menu4.setText("0");
        menu5.setText("0");
        menu6.setText("0");
        menu7.setText("0");
        menu8.setText("0");
        total_harga.setText("0");

        registerForContextMenu(menu1);
        registerForContextMenu(menu2);
        registerForContextMenu(menu3);
        registerForContextMenu(menu4);
        registerForContextMenu(menu5);
        registerForContextMenu(menu6);
        registerForContextMenu(menu7);
        registerForContextMenu(menu8);

        String data1 = menu1.getText().toString();
        String data2 = menu2.getText().toString();
        String data3 = menu3.getText().toString();
        String data4 = menu4.getText().toString();
        String data5 = menu5.getText().toString();
        String data6 = menu6.getText().toString();
        String data7 = menu7.getText().toString();
        String data8 = menu8.getText().toString();

        a = Integer.valueOf(data1);
        b = Integer.valueOf(data2);
        c = Integer.valueOf(data3);
        d = Integer.valueOf(data4);
        e = Integer.valueOf(data5);
        f = Integer.valueOf(data6);
        g = Integer.valueOf(data7);
        h = Integer.valueOf(data8);

        juma = a * 7000;
        jumb = b * 7000;
        jumc = c * 7000;
        jumd = d * 7000;
        jume = e * 7000;
        jumf = f * 7000;
        jumg = g * 7000;
        jumh = h * 7000;

        jumlah = ((juma) + (jumb) + (jumc) + (jumd) + (jume) + (jumf) + (jumg) + (jumh));

        if (jumlah==0){
            Toast.makeText(Menu.this,"Setidaknya Membeli 1",Toast.LENGTH_SHORT).show();
        }

        total_harga.setText(jumlah);

    }

    public void pesanan(View view) {
        Intent pesan = new Intent(Menu.this,Selesai.class);
        startActivity(pesan);
    }

    public void kembali(View view) {
        Intent kem = new Intent(Menu.this,MainActivity.class);
        startActivity(kem);
    }
}
