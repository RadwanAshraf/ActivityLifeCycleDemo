package com.radwan_pc.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.B_secActivity);
        Toast.makeText(MainActivity.this, "OnCreate IS Here",Toast.LENGTH_LONG).show();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),SecondActivity.class);
                startActivity(intent);

            }
        });

    }

    //// Menu inflater
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    //// Menu Item select

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId())
        {
            case R.id.Home:
                Toast.makeText(this,"Home Selected",Toast.LENGTH_SHORT).show();
                return true;

            case R.id.Favorite:
                Toast.makeText(this,"Favorite Selected",Toast.LENGTH_SHORT).show();
                return true;

            case R.id.About:
                Toast.makeText(this,"About Selected",Toast.LENGTH_SHORT).show();
                return true;

        }

        return super.onOptionsItemSelected(item);
    }



    // Activity Life Cycle

    @Override
    protected void onStart() {

        Toast.makeText(MainActivity.this, "OnStart IS Here",Toast.LENGTH_LONG).show();

        super.onStart();
    }

    @Override
    protected void onResume() {

        Toast.makeText(MainActivity.this, "OnResume IS Here",Toast.LENGTH_SHORT).show();

        super.onResume();
    }

    @Override
    protected void onPause() {

        Toast.makeText(MainActivity.this, "OnPause IS Here",Toast.LENGTH_SHORT).show();
        super.onPause();
    }

    @Override
    protected void onStop() {

        Toast.makeText(MainActivity.this, "OnStop IS Here",Toast.LENGTH_LONG).show();

        super.onStop();
    }

    @Override
    protected void onDestroy() {

        Toast.makeText(MainActivity.this, "OnDestroy IS Here",Toast.LENGTH_SHORT).show();

        super.onDestroy();
    }

    @Override
    protected void onRestart() {

        Toast.makeText(MainActivity.this, "OnRestart IS Here",Toast.LENGTH_SHORT).show();

        super.onRestart();
    }



}
