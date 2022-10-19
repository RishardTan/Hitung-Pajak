package com.example.hitungpajak;

import android.app.Application;

public class GlobalClass extends Application
{
    private int penghasilan,TunjanganKeluarga,TunjanganLain;
    public int getPenghasilan(){return penghasilan;}
    public void setPenghasilan(int penghasilan) {this.penghasilan = penghasilan;}
    public int getTunjanganKeluarga(){return TunjanganKeluarga;}
    public void setTunjanganKeluarga(int TunjanganKeluarga) {this.TunjanganKeluarga = TunjanganKeluarga;}
    public int getTunjanganLain(){return TunjanganLain;}
    public void setTunjanganLain(int TunjanganLain) {this.TunjanganLain = TunjanganLain;}
}
