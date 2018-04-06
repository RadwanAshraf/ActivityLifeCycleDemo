package com.radwan_pc.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigInteger;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toast.makeText(SecondActivity.this, "Second Activity ' OnCreate ' IS Here",Toast.LENGTH_SHORT).show();

    }



    @Override
    protected void onStart() {

        Toast.makeText(SecondActivity.this, "Second Activity ' OnStart ' IS Here",Toast.LENGTH_SHORT).show();

        super.onStart();
    }

    @Override
    protected void onResume() {

        Toast.makeText(SecondActivity.this, "Second Activity ' OnResume ' IS Here",Toast.LENGTH_SHORT).show();

        super.onResume();
    }

    @Override
    protected void onPause() {

        Toast.makeText(SecondActivity.this, "Second Activity ' OnPause ' IS Here",Toast.LENGTH_SHORT).show();
        super.onPause();
    }

    @Override
    protected void onStop() {

        Toast.makeText(SecondActivity.this, "Second Activity ' OnStop ' IS Here",Toast.LENGTH_SHORT).show();

        super.onStop();
    }

    @Override
    protected void onDestroy() {

        Toast.makeText(SecondActivity.this, "Second Activity ' OnDestroy ' IS Here",Toast.LENGTH_SHORT).show();

        super.onDestroy();
    }

    @Override
    protected void onRestart() {

        Toast.makeText(SecondActivity.this, "Second Activity ' OnRestart ' IS Here",Toast.LENGTH_SHORT).show();

        super.onRestart();
    }



}
