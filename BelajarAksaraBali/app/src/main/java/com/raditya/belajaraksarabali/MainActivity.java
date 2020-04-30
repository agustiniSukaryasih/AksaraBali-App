package com.raditya.belajaraksarabali;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp;
    Button mut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        ImageView img = (ImageView) findViewById(R.id.swing_play);
        img.setBackgroundResource(R.drawable.animasi1);
        ImageView img1 = (ImageView) findViewById(R.id.swing_play1);
        img1.setBackgroundResource(R.drawable.animasi1);

        AnimationDrawable frameAnimation = (AnimationDrawable) img.getBackground();
        AnimationDrawable frameAnimationn = (AnimationDrawable) img1.getBackground();

        frameAnimation.start();
        frameAnimationn.start();

        mp=MediaPlayer.create(MainActivity.this, R.raw.backsound);
        mp.setLooping(true);
        mp.start();

        mut=(Button)findViewById(R.id.suarabutt);
        mut.setOnClickListener(mte);

    }
    public void pindah(View v){
        Intent i=new Intent(getApplicationContext(),Mulai.class);
        startActivity(i);
    }
    public void pindah1(View v){
        Intent i=new Intent(getApplicationContext(),Tentang.class);
        startActivity(i);
    }
    public void close(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Apakah Anda Ingin Keluar Dari Aplikasi?")
                .setCancelable(false)
                .setPositiveButton("Ya",new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        MainActivity.this.finish();
                        mp.stop();
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
    public void paused(){
        if(mp.isPlaying()){
            if(mp!=null){
                mp.pause();
                mut.setBackgroundResource(R.drawable.play);
            }
        }else{
            if (mp!=null){
                mp.start();
                mut.setBackgroundResource(R.drawable.mute);
            }
        }
    }
    View.OnClickListener mte = new View.OnClickListener() {

        @Override
        public void onClick(View arg0) {
            // TODO Auto-generated method stub
            paused();

        }
    };
    public void pindah2(View v){
        close();
    }
}
