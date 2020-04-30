package com.raditya.belajaraksarabali;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AksaraBali extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aksara_bali);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    public void wianjana(View view){
        Intent i=new Intent(getApplicationContext(),AksaraWianjana.class);
        startActivity(i);
    }
    public void pengsu(View view){
        Intent i=new Intent(getApplicationContext(),Main2Activity.class);
        startActivity(i);
    }
    public void angka(View view){
        Intent i=new Intent(getApplicationContext(),AngkaBali.class);
        startActivity(i);
    }
    public void gng(View view){
        Intent i=new Intent(getApplicationContext(),Gantungandangempelan.class);
        startActivity(i);
    }
    public void pengte(View view){
        Intent i=new Intent(getApplicationContext(),PenganggeTengenan.class);
        startActivity(i);
    }
    public void swalalita(View view){
        Intent i=new Intent(getApplicationContext(),AksaraSwalalita.class);
        startActivity(i);
    }
    public void aksarasuara(View view){
        Intent i=new Intent(getApplicationContext(),AksaraSuara.class);
        startActivity(i);
    }
    public void goangka(View view){
        Intent i=new Intent(getApplicationContext(),AngkaBalii.class);
        startActivity(i);
    }
}
