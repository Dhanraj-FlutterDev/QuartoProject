package com.example.dhanraj.quartoproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Room_Activity extends AppCompatActivity {

    private TextView tvtitle,tvdescription,tvcategory,tvaddress,tvphone,actualphone,tvfeatures,features,feafea;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);

        tvtitle = (TextView) findViewById(R.id.txttitle);
        tvdescription = (TextView) findViewById(R.id.txtDesc);
        tvcategory = (TextView) findViewById(R.id.txtCat);
       tvaddress = (TextView) findViewById(R.id.address);
       // actualaddress = (TextView) findViewById(R.id.ad);
        tvphone = (TextView) findViewById(R.id.phonetitle);
        actualphone = (TextView) findViewById(R.id.phoneno);
        features = (TextView) findViewById(R.id.features);
        feafea = (TextView) findViewById(R.id.feafea);
        img = (ImageView) findViewById(R.id.bookthumbnail);

        // Recieve data
        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Description = intent.getExtras().getString("Description");
        String Address = intent.getExtras().getString("Address");
        String PhoneTitle = intent.getExtras().getString("PhoneTitle");
        String PhoneNumber = intent.getExtras().getString("PhoneNumber");
        String Features = intent.getExtras().getString("Features");
        String Feafea = intent.getExtras().getString("Feafea");
        int image = intent.getExtras().getInt("Thumbnail") ;

        // Setting values

        tvtitle.setText(Title);
        tvdescription.setText(Description);
        tvaddress.setText(Address);
        tvphone.setText(PhoneNumber);
        actualphone.setText(PhoneTitle);
        features.setText(Features);
        feafea.setText(Feafea);
        img.setImageResource(image);


    }
}
