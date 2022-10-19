package com.example.hitungpajak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RincianPegawai extends AppCompatActivity
{
    static Pegawai pegawai;

    public static void setPegawai(Pegawai p)
    {
        pegawai=p;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rincian_pegawai);

        GlobalClass global = (GlobalClass) getApplicationContext();
        TextView gaji = (TextView) findViewById(R.id.AngkaGaji);
        gaji.setText("Rp. "+(int) pegawai.gaji+"");
        TextView tunjanganKel = (TextView) findViewById(R.id.AngkaTunjanganK);
        tunjanganKel.setText("Rp. "+(int)pegawai.tunjanganKeluarga+"");
        TextView tunjanganLain = (TextView) findViewById(R.id.AngkaTunjanganL);
        tunjanganLain.setText("Rp. "+(int)pegawai.tunjanganLain+"");
        TextView Bruto = (TextView) findViewById(R.id.AngkaBruto);
        Bruto.setText("Rp. "+(int)pegawai.penghasilanBruto+"");

        Pegawai.hitung(pegawai);
        TextView biayaJ = (TextView) findViewById(R.id.biayaJabatan);
        biayaJ.setText("Rp. "+(int) pegawai.biayaJabatan+"");
        TextView biayaP = (TextView) findViewById(R.id.biayaPensiun);
        biayaP.setText("Rp. "+(int) pegawai.biayaPensiun+"");
        TextView penghasilanNeto = (TextView) findViewById(R.id.penghasilanNeto);
        penghasilanNeto.setText("Rp. "+(int) pegawai.penghasilanNeto+"");

        Pegawai.hitung2(pegawai);
        TextView netoTahun = (TextView) findViewById(R.id.penghasilanNetoTahun);
        netoTahun.setText("Rp. "+(int) pegawai.penghasilanNetoTahun+"");
        TextView ptkp = (TextView) findViewById(R.id.PTKP);
        ptkp.setText("Rp. "+(int) pegawai.ptkp+"");
        TextView pkp = (TextView) findViewById(R.id.PenghasilanKenaPajak);
        pkp.setText("Rp. "+(int) pegawai.pkp+"");
        TextView tarif = (TextView) findViewById(R.id.tarifPajak);
        tarif.setText("Rp. "+(int) pegawai.tarif+"");

        Button bayar = (Button) findViewById(R.id.BayarButton);
        bayar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(RincianPegawai.this, MainActivity.class);
                startActivity(intent);
            }
        });
        Button review = (Button) findViewById(R.id.reviewButton);
        review.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(RincianPegawai.this, Files.class);
                startActivity(intent);
            }
        });
    }
}