package com.example.hitungpajak;

public class Pengusaha
{
    int omset,pengeluaran;
    int pkp;
    double tarif;

    public Pengusaha(int omset,int pengeluaran)
    {
        this.omset=omset;
        this.pengeluaran=pengeluaran;
        this.pkp=omset-pengeluaran;
    }
    public static void hitungTarif(Pengusaha p)
    {
        if(p.pkp<=50000000)
        {
            p.tarif=0.05*p.pkp;
        }
        if(p.pkp>50000000 && p.pkp<=250000000)
        {
            double a=0.05*50000000;
            double b=0.15*(p.pkp-50000000);
            p.tarif=a+b;
        }
        if(p.pkp>250000000 && p.pkp<=500000000)
        {
            double a=0.05*50000000;
            double b=0.15*200000000;
            double c=0.25*(p.pkp-250000000);
            p.tarif=a+b+c;
        }
        if(p.pkp>500000000)
        {
            double a=0.05*50000000;
            double b=0.15*200000000;
            double c=0.25*250000000;
            double d=0.5*(p.pkp-500000000);
            p.tarif=a+b+c+d;
        }
    }
}
