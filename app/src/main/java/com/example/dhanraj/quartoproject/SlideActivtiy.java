package com.example.dhanraj.quartoproject;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toolbar;

public class SlideActivtiy extends AppCompatActivity {

    private Toolbar toolbar;
    private ViewPager viewPager;
    private SlideAdapter myadapter;
   // Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_activtiy);
     //   myDialog = new Dialog(this);


        viewPager= (ViewPager)findViewById(R.id.viewpager);
        myadapter = new SlideAdapter(this);
        viewPager.setAdapter(myadapter);
        toolbar = (Toolbar) findViewById(R.id.app_bar);


    }
   /*public void ShowPopUps(View view){
        TextView txt;
        myDialog.setContentView(R.layout.custompopup);
        txt= (TextView)myDialog.findViewById(R.id.backclick);
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();




    }*/
}
