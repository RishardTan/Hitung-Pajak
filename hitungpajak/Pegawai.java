package com.example.hitungpajak;

public class Pegawai
{
    int gaji,tunjanganKeluarga, tunjanganLain,penghasilanBruto;
    double biayaJabatan, biayaPensiun, penghasilanNeto;
    double penghasilanNetoTahun, ptkp, pkp, tarif;

    public Pegawai(int gaji,int tunjanganKeluarga, int tunjanganLain)
    {
        this.gaji=gaji;
        this.tunjanganKeluarga=tunjanganKeluarga;
        this.tunjanganLain=tunjanganLain;
        this.penghasilanBruto=gaji-tunjanganKeluarga-tunjanganLain;
    }

    public static void hitung(Pegawai p)
    {
        if(0.05*p.gaji>500000)
        {
            p.biayaJabatan=500000;
        }
        else
        {
            p.biayaJabatan=0.05*p.gaji;
        }
        if(0.0475*p.gaji>2400000)
        {
            p.biayaPensiun=2400000;
        }
        else
        {
            p.biayaPensiun=0.0475*p.gaji;
        }
        p.penghasilanNeto=p.penghasilanBruto-p.biayaPensiun-p.biayaJabatan;
    }

    public static void hitung2(Pegawai p)
    {
        p.penghasilanNetoTahun=p.penghasilanNeto*12;

        if(p.penghasilanNetoTahun>54000000)
        {
            p.ptkp=54000000;
            p.pkp=p.penghasilanNetoTahun-p.ptkp;
            p.tarif=0.05*p.pkp;
        }
    }

}
