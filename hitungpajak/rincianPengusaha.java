package com.example.hitungpajak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class rincianPengusaha extends AppCompatActivity
{
    static Pengusaha pengusaha;
    public static void createPengusaha(Pengusaha p)
    {
        pengusaha=p;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rincian_pengusaha);

        TextView omset = (TextView) findViewById(R.id.omsetTahun);
        omset.setText("Rp. "+(int) pengusaha.omset+"");
        TextView pengeluaran = (TextView) findViewById(R.id.pengeluaranTahun);
        pengeluaran.setText("Rp. "+(int) pengusaha.pengeluaran+"");
        TextView pkp = (TextView) findViewById(R.id.pkp);
        pkp.setText("Rp. "+(int) pengusaha.pkp+"");

        Pengusaha.hitungTarif(pengusaha);
        TextView tarif = (TextView) findViewById(R.id.TarifPengusaha);
        tarif.setText("Rp. "+(int) pengusaha.tarif+"");

        Button bayar = (Button) findViewById(R.id.bayar);
        bayar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(rincianPengusaha.this, MainActivity.class);
                startActivity(intent);
            }
        });
        Button review = (Button) findViewById(R.id.ReviewButton);
        review.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(rincianPengusaha.this, Files.class);
                startActivity(intent);
            }
        });
    }


}

