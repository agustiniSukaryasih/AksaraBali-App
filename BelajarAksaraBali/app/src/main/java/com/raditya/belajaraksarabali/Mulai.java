package com.raditya.belajaraksarabali;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.Random;

public class Mulai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mulai);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    public void pindahaksara(View view){
        Intent i=new Intent(getApplicationContext(),AksaraBali.class);
        startActivity(i);
    }

    public void pindahcara(View view){
        Intent i=new Intent(getApplicationContext(),Cara.class);
        startActivity(i);
    }

    public void pindahkuis(View view){
        ArrayList<Class> activityList = new ArrayList<Class>();
        activityList.add(Kuis.class);
        activityList.add(Kuis21.class);
        activityList.add(Kuis31.class);
        activityList.add(Kuis41.class);

        Random generator = new Random();
        int number = generator.nextInt(4) + 1;

        Class activity = null;

        // Here, we are checking to see what the output of the random was
        switch(number) {
            case 1:
                activity = Kuis.class;
                // We are adding the number of the activity to the list
                activityList.remove(Kuis.class);
                break;
            case 2:
                activity = Kuis21.class;
                // We are adding the number of the activity to the list
                activityList.remove(Kuis21.class);
                break;
            case 3:
                activity = Kuis41.class;
                // We are adding the number of the activity to the list
                activityList.remove(Kuis41.class);
                break;
            default:
                activity = Kuis31.class;
                activityList.remove(Kuis31.class);
                break;
        }
        // We use intents to start activities
        Intent intent = new Intent(getBaseContext(), activity);
        // `intent.putExtra(...)` is used to pass on extra information to the next activity
        intent.putExtra("ACTIVITY_LIST", activityList);

        startActivity(intent);
    }

}
