package com.example.hitungpajak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //static Account account;

    //public static void loginInfo (Account a)
    {
        //account=a;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView nama = (TextView) findViewById(R.id.HomeName);
        nama.setText("User");

        Button PegawaiButton = (Button) findViewById(R.id.PegawaiButton);
        PegawaiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HitungPegawai();
            }
        });
        Button PengusahaButton = (Button) findViewById(R.id.PengusahaButton);
        PengusahaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HitungPengusaha();
            }
        });
        Button RegulasiButton = (Button) findViewById(R.id.RegulasiButton);
        RegulasiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Regulasi();
            }
        });
        Button FilesButton = (Button) findViewById(R.id.FilesButton);
        FilesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Files();
            }
        });
    }
    public void HitungPegawai()
    {
        Intent intent = new Intent(MainActivity.this, PajakPegawai.class);
        startActivity(intent);
    }
    public void HitungPengusaha()
    {
        Intent intent = new Intent(MainActivity.this, PajakPengusaha.class);
        startActivity(intent);
    }
    public void Regulasi()
    {
        Intent intent = new Intent(MainActivity.this, Regulasi.class);
        startActivity(intent);
    }
    public void Files()
    {
        Intent intent = new Intent(MainActivity.this, Files.class);
        startActivity(intent);
    }
}