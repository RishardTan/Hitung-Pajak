package com.example.hitungpajak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class PajakPegawai extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pajak_pegawai);
        GlobalClass global = (GlobalClass) getApplicationContext();

        EditText GajiPokok = (EditText) findViewById(R.id.GajiPokok);
        EditText TunjanganKeluarga = (EditText) findViewById(R.id.TunjanganKeluarga);
        EditText TunjanganLain = (EditText) findViewById(R.id.TunjanganLain);

        Button Hitung = (Button) findViewById(R.id.HitungButton);
        Hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                int Gaji = Integer.parseInt(GajiPokok.getText().toString());
                int TunjanganK = Integer.parseInt(TunjanganKeluarga.getText().toString());
                int TunjanganL = Integer.parseInt(TunjanganLain.getText().toString());
                RincianPegawai.setPegawai(new Pegawai(Gaji,TunjanganK,TunjanganL));

                RincianPegawai();
            }
        });
    }

    public void RincianPegawai()
    {
        Intent intent = new Intent(PajakPegawai.this, RincianPegawai.class);
        startActivity(intent);
    }
}