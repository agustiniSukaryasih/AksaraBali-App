package com.raditya.belajaraksarabali;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class skor1 extends AppCompatActivity {

    int point, benar, salah;

    TextView nilai_point, hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skor1);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        nilai_point = (TextView) findViewById(R.id.Point);
        nilai_point.setText("Nilai Kamu : " + point);

        hasil = (TextView) findViewById(R.id.Hasil_Jawaban);
        hasil.setText("Jawaban Benar : " + benar + "\nJawaban Salah : "
                + salah);
    }
}
