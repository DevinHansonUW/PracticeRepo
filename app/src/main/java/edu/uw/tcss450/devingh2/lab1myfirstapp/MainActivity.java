package edu.uw.tcss450.devingh2.lab1myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Debugging");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "Getting Info");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "ERROR");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v(TAG, "Very Verbose");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w(TAG, "WARNING");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "You're DeBugging me");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "For Your Information");
    }
}