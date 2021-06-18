package ru.geekbrains.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Life Cycle" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            makeToast("Первый запуск - onCreate()");
        } else {
            makeToast("Повторный запуск - onCreate()");
        }

    }


    @Override
    protected void onStart() {
        super.onStart();
        makeToast("onRestart()");
    }


    @Override
    protected void onPause() {
        super.onPause();
        makeToast("onRestart()");
    }


    @Override

    protected void onStop() {
        super.onStop();
        makeToast("onRestart()");
    }

    @Override

    protected void onDestroy() {
        super.onDestroy();
        makeToast("onRestart()");
    }

    @Override

    protected void onRestart() {
        super.onRestart();

        makeToast("onRestart()");
    }

    @Override

    protected void onSaveInstanceState(Bundle saveInstanceState) {
        super.onSaveInstanceState(saveInstanceState);
        makeToast("onInstanceState()");

    }

    @Override

    protected void onRestoreInstanceState(Bundle saveInstanceState) {
        super.onRestoreInstanceState(saveInstanceState);
        makeToast("onRestoreInstanceState()");
    }

    private void makeToast(String message){
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show();
            Log.d(TAG, message);
    }

}