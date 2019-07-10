package com.example.dhanraj.quartoproject;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class SlideAdapter extends PagerAdapter {

    Context context;
    LayoutInflater inflater;


    public int[] my_images = {

            R.drawable.lux,
            R.drawable.lux1,
            R.drawable.lux2,
            R.drawable.lux3,
            R.drawable.lux4,
            R.drawable.lux1,
            R.drawable.lux5,

    };



    public String[] my_title = {

            "₹ 1300",
            "₹ 1100",
            "₹ 1500",
            "₹ 1000",
            "₹ 1400",
            "₹ 1500",
            "₹ 1250"

    };

    public String[] my_description = {

            "Click On the Image to get more info",
            "Click On the Image to get more info",
            "Click On the Image to get more info",
            "Click On the Image to get more info",
            "Click On the Image to get more info",
            "Click On the Image to get more info",
            "Click On the Image to get more info"

    };

   public int[] my_colours = {

            Color.rgb(239,85,85),
           Color.rgb(110,49,89),
           Color.rgb(1,181,212),
            Color.rgb(255,140,0),
           Color.rgb(239,85,85),
           Color.rgb(110,49,89),
            Color.rgb(1,181,212),
           //Color.rgb(110,49,89),
           //Color.rgb(1,181,212)
            //Color.rgb(42,144,132),
            //Color.rgb(42,144,132),
           //Color.rgb(110,49,89),
           //Color.rgb(239,85,85),
           //Color.rgb(1,181,212)
            //Color.rgb(42,144,132),
            //Color.rgb(42,144,132),
            //Color.rgb(239,85,85),
            //Color.rgb(110,49,89),
            //Color.rgb(1,181,212)
    };

    public SlideAdapter(Context context){

        this.context=context;

    }

    @Override
    public int getCount() {
        return my_title.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == (LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {
        inflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.slide,container,false);
        LinearLayout linearLayout = view.findViewById(R.id.slidelayout);
        ImageView imageView = (ImageView)view.findViewById(R.id.slideimg);
        final TextView textView = (TextView)view.findViewById(R.id.txt);
        TextView des = (TextView)view.findViewById(R.id.text_description);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(position==0){
                    final Dialog myDialog;
                    myDialog = new Dialog(context);
                        TextView txt;
                        myDialog.setContentView(R.layout.popup1);
                        txt= (TextView)myDialog.findViewById(R.id.backclick);
                        txt.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                myDialog.dismiss();
                            }
                        });
                        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        myDialog.show();

                }
                else if(position==1){
                    final Dialog myDialog;
                    myDialog = new Dialog(context);
                    TextView txt;
                    myDialog.setContentView(R.layout.popup2);
                    txt= (TextView)myDialog.findViewById(R.id.backclick);
                    txt.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            myDialog.dismiss();
                        }
                    });
                    myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    myDialog.show();

                }
                else if(position==2){
                    final Dialog myDialog;
                    myDialog = new Dialog(context);
                    TextView txt;
                    myDialog.setContentView(R.layout.popup3);
                    txt= (TextView)myDialog.findViewById(R.id.backclick);
                    txt.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            myDialog.dismiss();
                        }
                    });
                    myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    myDialog.show();

                }
                else if(position==3){
                    final Dialog myDialog;
                    myDialog = new Dialog(context);
                    TextView txt;
                    myDialog.setContentView(R.layout.popup4);
                    txt= (TextView)myDialog.findViewById(R.id.backclick);
                    txt.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            myDialog.dismiss();
                        }
                    });
                    myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    myDialog.show();

                }
                else if(position==4){
                    final Dialog myDialog;
                    myDialog = new Dialog(context);
                    TextView txt;
                    myDialog.setContentView(R.layout.popup5);
                    txt= (TextView)myDialog.findViewById(R.id.backclick);
                    txt.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            myDialog.dismiss();
                        }
                    });
                    myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    myDialog.show();

                }
                else if(position==5){
                    final Dialog myDialog;
                    myDialog = new Dialog(context);
                    TextView txt;
                    myDialog.setContentView(R.layout.popup6);
                    txt= (TextView)myDialog.findViewById(R.id.backclick);
                    txt.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            myDialog.dismiss();
                        }
                    });
                    myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    myDialog.show();

                }
                else if(position==6){
                    final Dialog myDialog;
                    myDialog = new Dialog(context);
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

                }
             /*   else if(position==7){
                    final Dialog myDialog;
                    myDialog = new Dialog(context);
                    TextView txt;
                        myDialog.setContentView(R.layout.popup1);
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
        });
        linearLayout.setBackgroundColor(my_colours[position]);
        imageView.setImageResource(my_images[position]);
        textView.setText(my_title[position]);
        des.setText(my_description[position]);
        container.addView(view);
        return view;

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }
}

