package com.example.hitungpajak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PajakPengusaha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pajak_pengusaha);
        EditText omset = (EditText) findViewById(R.id.omset);
        EditText pengeluaran = (EditText) findViewById(R.id.pengeluaran);

        Button hitung = (Button) findViewById(R.id.hitungButton);
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                int Omset = Integer.parseInt(omset.getText().toString());
                int Pengeluaran = Integer.parseInt(pengeluaran.getText().toString());
                rincianPengusaha.createPengusaha(new Pengusaha(Omset,Pengeluaran));

                Intent intent = new Intent(PajakPengusaha.this, rincianPengusaha.class);
                startActivity(intent);
            }
        });
    }
}