package edu.uw.tcss450.plee83.lab1myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "Sprint 0 Test - Alexz");
        Log.e(TAG,"onCreate method: error log");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart method: debug log");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume method: information log");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w(TAG, "onPause method: warning log");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAG, "onStop method: verbose log");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy method: error log");
        Log.wtf(TAG, "this is a test - Paul Lee");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart method: information log");
    }

}