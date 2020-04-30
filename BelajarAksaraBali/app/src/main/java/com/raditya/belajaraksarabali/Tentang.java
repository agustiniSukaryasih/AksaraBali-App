package com.raditya.belajaraksarabali;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class Tentang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }
    public void gmailku(View v){
        AlertDialog alertDialog = new AlertDialog.Builder(Tentang.this).create();
        alertDialog.setTitle("Gmail");
        alertDialog.setMessage("radityaary123@gmail.com");
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        alertDialog.show();
    }
    public void fbku(View v){
        Intent openURL = new Intent(android.content.Intent.ACTION_VIEW);
        openURL.setData(Uri.parse("http://facebook.com/dewa.k.raditya.5"));
        startActivity(openURL);
    }
    public void telku(View v){
        AlertDialog alertDialog = new AlertDialog.Builder(Tentang.this).create();
        alertDialog.setTitle("Telepon/WA");
        alertDialog.setMessage("+6285739240573");
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        alertDialog.show();
    }
}
