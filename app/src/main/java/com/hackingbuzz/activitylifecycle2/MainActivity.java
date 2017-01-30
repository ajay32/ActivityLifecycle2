package com.hackingbuzz.activitylifecycle2;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

   // see Which activity methods gets called when orientation changes occur?


    public static final String TAG = "ActivityLifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG," onCreate() Called");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart() Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume() Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause() Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop() Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy() called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart() called");

    }



    // this method called because to save data before it all wiped away ....when orientation changes..


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        // you can control this method to save all your data
        // you can save a particular element of xml by giving it (id ) attribute...but thats not enough we need to save the data with all the logics ...so this method comes to play..

        // go verbose we also got Log.e  rather than info
        Log.e(TAG, "onSaveInstanceState() called");   // Log.e because we want to notice these two methods ...e gives us red color to differentiate ..
    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        Log.e(TAG, "onRestoreInstanceState() called");
    }


}




// this is not the saveInstance method   ( the lifecycle method has only one paramenter that is bundle)
 /*   @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);


    }*/