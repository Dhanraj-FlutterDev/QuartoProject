package com.example.dhanraj.quartoproject;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.view.Window;
import android.widget.Toolbar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;


import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;
import com.google.firebase.auth.FirebaseAuth;

public class HomePage extends AppCompatActivity implements View.OnClickListener {

    private Toolbar toolbar;

    FloatingActionMenu floatingActionMenu;
    FloatingActionButton mSignOutButton;
    private static final String TAG = "PhoneAuthActivity";
    private FirebaseAuth mAuth;
    //tools:context="com.example.dhanraj.quartoproject.HomePage">

    CardView boy,girl,lux;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setActionBar(toolbar);
        boy = (CardView) findViewById(R.id.boycategory);
        girl = (CardView) findViewById(R.id.girlcatagory);
        lux = (CardView) findViewById(R.id.luxury);

        boy.setOnClickListener(this);
        girl.setOnClickListener(this);
        lux.setOnClickListener(this);

        floatingActionMenu = (FloatingActionMenu) findViewById(R.id.floatingmenu);

        mSignOutButton = (FloatingActionButton) findViewById(R.id.floatbutton);
        mAuth = FirebaseAuth.getInstance();
        mSignOutButton.setOnClickListener(this);
        Window window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.statusbar2));



    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.boycategory: Intent i = new Intent(this,MainActivity.class);
                startActivity(i);
                break;
            case R.id.girlcatagory:Intent j = new Intent(this,MainActivity.class);
                startActivity(j);
                break;
            case R.id.luxury:Intent k = new Intent(this,SlideActivtiy.class);
                startActivity(k);
                break;
            case R.id.floatbutton:

                AlertDialog.Builder builder = new AlertDialog.Builder(HomePage.this);
                builder.setMessage("Do you really want to Sign Out ?").setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {


                                SharedPreferences mPreferences;

                                mPreferences = getSharedPreferences("User", MODE_PRIVATE);
                                SharedPreferences.Editor editor = mPreferences.edit();
                                editor.clear();
                                editor.apply();
                                mAuth.signOut();

                                startActivity(new Intent(HomePage.this, PhoneAuthActivity.class));


                            }
                        })

                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });
                AlertDialog dialog = builder.create();
                dialog.setTitle("Confirm");
                dialog.show();
                break;


            default:
                break;

        }


    }
}
