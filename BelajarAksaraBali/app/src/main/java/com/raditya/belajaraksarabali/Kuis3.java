package com.raditya.belajaraksarabali;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Kuis3 extends AppCompatActivity {

    Button jawab, button_next1;
    EditText text_jawab;
    int point, benar, salah;
    String jawabsoal = "desa";
    TextView salah_benar, nilai_point;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis3);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        benar = getIntent().getIntExtra("BenaR", 0);
        salah = getIntent().getIntExtra("SalaH", 0);
        point = getIntent().getIntExtra("PoinT", 0);
        text_jawab = (EditText)findViewById(R.id.jawab_text);

        nilai_point = (TextView) findViewById(R.id.Point);
        nilai_point.setText("Nilai Kamu : " + point);

        salah_benar = (TextView) findViewById(R.id.Benar_Salah);
        button_next1 = (Button) findViewById(R.id.next1);
        button_next1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent m2 = new Intent(Kuis3.this, Kuis4.class);
                m2.putExtra("BenaR", benar);
                m2.putExtra("SalaH", salah);
                m2.putExtra("PoinT", point);
                startActivity(m2);
                finish();
            }
        });
        jawab=(Button)findViewById(R.id.butjawab);
        jawab.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                if(text_jawab.getText().toString().equalsIgnoreCase(jawabsoal)){
                    benar++;
                    point = point + 25;
                    salah_benar.setText("BENAR");
                    salah_benar.setTextColor(Color.GREEN);
                    salah_benar.setVisibility(View.VISIBLE);
                    button_next1.setVisibility(View.VISIBLE);
                    jawab.setEnabled(false);
                /*Intent m2 = new Intent(MainActivity.this, MainActivity3.class);
                m2.putExtra("BenaR", benar);
                m2.putExtra("SalaH", salah);
                m2.putExtra("PoinT", point);
                startActivity(m2);
                finish();*/
                }else{
                    salah++;
                    salah_benar.setText("SALAH");
                    salah_benar.setTextColor(Color.RED);
                    salah_benar.setVisibility(View.VISIBLE);
                    button_next1.setVisibility(View.VISIBLE);
                    jawab.setEnabled(false);
				/*Intent m2 = new Intent(MainActivity.this, MainActivity3.class);
                m2.putExtra("BenaR", benar);
                m2.putExtra("SalaH", salah);
                m2.putExtra("PoinT", point);
                startActivity(m2);
                finish();*/
                }
            }
        });
    }
    public void close(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Apakah Anda Ingin Keluar Dari Game Ini?")
                .setCancelable(false)
                .setPositiveButton("Ya",new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        Kuis3.this.finish();
                    }
                })
                .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int arg1) {
                        dialog.cancel();
                    }
                }).show();
    }
    public boolean onKeyDown(int keyCode, KeyEvent event){
        if (keyCode==KeyEvent.KEYCODE_BACK){
            close();
        }
        return false;
    }
}
