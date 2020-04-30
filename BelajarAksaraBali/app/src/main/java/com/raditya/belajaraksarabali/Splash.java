package com.raditya.belajaraksarabali;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;

public class Splash extends AppCompatActivity {

    protected boolean _aktif=true;
    protected int splash_ = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        Thread splashThread = new Thread(){
            public void run(){
                try{
                    int delay_ = 0;
                    while(_aktif&&(delay_ < splash_)){
                        sleep(100);
                        if(_aktif){
                            delay_ +=70;
                        }
                    }
                }catch (InterruptedException e){
                }finally{
                    finish();
                    Intent panggil_class=new Intent
                            (Splash.this,MainActivity.class);
                    startActivityForResult(panggil_class, 0);
                }
            }
        };
        splashThread.start();
    }
    public boolean onTouchEvent(MotionEvent event){
        if(event.getAction()==MotionEvent.ACTION_DOWN)
        {
            _aktif=false;
        }
        return true;
    }

    public void onBackPressed(){
        finish();
        System.exit(0);
    }
}
