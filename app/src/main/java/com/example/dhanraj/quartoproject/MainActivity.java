package com.example.dhanraj.quartoproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toolbar;

import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "PhoneAuthActivity";

    private Toolbar toolbar;
    RecyclerView myrv;
    RecyclerViewAdapter myAdapter;

    List<Room> lstRoom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lstRoom = new ArrayList<>();
        lstRoom.add(new Room("₹ 800", "Decent Quality Room", "Address","10/11 kishori apartment, takawle ring road mahasatta square Ichalkaranji.","Mr.Sunail Patil -  9156848595","Phone","Features","Fan, Attached Bathroom, Study Table Provided, Electricity Bill Excludes",R.drawable.rooom1));
        lstRoom.add(new Room("₹ 900", "Decent Quality Room", "Address","Vir kalam building takawdw ring road Ichalkaranji.","Mr.Suhas Khamkar - 8654759235","Phone","Features","Light Bulbs, Fan, Drinking Water, Chair, Bed, Bedsheets",R.drawable.rooom2));
        lstRoom.add(new Room("₹ 950", "Decent Quality Room", "Address","Flat no 20, Girnad apartment gandi square, near sundar bag, Ichalkaranji.","Mrs.Anita Mane - 7352648965","Phone","Features","Fan, Attached Bathroom, Study Table Provided, Electricity Bill Excludes, Light Bulbs, Fan, Drinking Water, Chair, Bed, Bedsheets", R.drawable.rooom3));
        lstRoom.add(new Room("₹ 850", "Decent Quality Room", "Address","Ghodke building, zenda square , near DKTE college , Ichalkaranji","Mr.Anil Shetty -  9165896478","Phone","Features","Light Bulbs, Fan, Drinking Water, Chair, Bed, Bedsheets", R.drawable.rooom4));
        lstRoom.add(new Room("₹ 700", "Decent Quality Room", "Address","Anjani appartmant, zenda square Ichalkaranji.","Mr.Aditya Sharma - 8365947895","Phone","Features","Fan, Attached Bathroom, Study Table Provided, Electricity Bill Excludes, Light Bulbs, Fan, Drinking Water, Chair, Bed, Bedsheets", R.drawable.rooom5));
        lstRoom.add(new Room("₹ 850", "Decent Quality Room", "Address","20/12 sukhkarta colony, mahipati nivas, takawde ring road, Ichalkaranji.","Mrs.Shwetali Petkar - 7395864821","Phone","Features","Fan, Attached Bathroom, Study Table Provided, Electricity Bill Excludes",R.drawable.rooom7));
        lstRoom.add(new Room("₹ 800", "Decent Quality Room", "Address","Home no 132, ashok shinde, chandni square, near water tank, Ichalkaranji.","Mr.Aniket Palkar - 9485968745","Phone","Features","Fan, Attached Bathroom, Study Table Provided, Electricity Bill Excludes, Light Bulbs, Fan, Drinking Water, Chair, Bed, Bedsheets", R.drawable.rooom8));
        lstRoom.add(new Room("₹ 750", "Decent Quality Room", "Address","Kamle nivas, zenda square behind reban shoe room, Ichalkaranji.","Mrs.Shivani Mohite - 9644758231","Phone","Features","Fan, Attached Bathroom, Study Table Provided, Electricity Bill Excludes, Light Bulbs, Fan, Drinking Water, Chair, Bed, Bedsheets\n",R.drawable.rooom2));
        lstRoom.add(new Room("₹ 950", "Decent Quality Room", "Address","Home number 20,Anil patil,hatti square near kut hospital, Ichalkaranji.","Mr.Omkar Koik - 9859641257","Phone","Features","Light Bulbs, Fan, Drinking Water, Chair, Bed, Bedsheets",R.drawable.rooom1));
        lstRoom.add(new Room("₹ 800", "Decent Quality Room", "Address","Star appartments ,Gajanan colony, limbu square, Ichalkaranji.","Mr.Vinayak Yadav 8352641759","Phone","Features","Fan, Attached Bathroom, Study Table Provided, Electricity Bill Excludes, Light Bulbs, Fan, Drinking Water, Chair, Bed, Bedsheets",R.drawable.rooom5));
        lstRoom.add(new Room("₹ 700", "Decent Quality Room", "Address","Home number 460,Patil nivas, nadives, near shiv mandir, Ichalkaranji.","Mr.Hemant Jadhav - 7566684265","Phone","Features","Fan, Attached Bathroom, Study Table Provided, Electricity Bill Excludes, Light Bulbs, Fan, Drinking Water, Chair, Bed, Bedsheets",R.drawable.rooom3));
        lstRoom.add(new Room("₹ 750", "Decent Quality Room", "Address","30/10 Nirmal colony, damdhar gokhle, mahasatta square, Ichalkaranji.","Mrs.Rohini Riste - 9145876935","Phone","Features","Fan, Attached Bathroom, Study Table Provided, Electricity Bill Excludes",R.drawable.rooom4));

        myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        myAdapter = new RecyclerViewAdapter(this, lstRoom);
        myrv.setLayoutManager(new GridLayoutManager(this, 1));
        myrv.setAdapter(myAdapter);
        toolbar = (Toolbar) findViewById(R.id.app_bar);

    }
}
