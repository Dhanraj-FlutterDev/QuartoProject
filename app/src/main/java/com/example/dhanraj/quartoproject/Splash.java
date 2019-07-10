package com.example.dhanraj.quartoproject;

import android.app.Activity;
import com.example.dhanraj.quartoproject.R;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Splash extends Activity {



    Thread splashThread;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        StartAnimation();
    }

    private void StartAnimation(){

        Animation anim = AnimationUtils.loadAnimation(this,R.anim.alpha);
        anim.reset();
        RelativeLayout i = (RelativeLayout)findViewById(R.id.lin_lay);
        i.clearAnimation();
        i.startAnimation(anim);
        anim= AnimationUtils.loadAnimation(this,R.anim.translate);
        anim.reset();
        ImageView iv = (ImageView)findViewById(R.id.splash);
        TextView tv = (TextView)findViewById(R.id.textView);
        iv.clearAnimation();
        tv.clearAnimation();
        iv.startAnimation(anim);
        tv.startAnimation(anim);
        Window window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.statusbar2));



        splashThread = new Thread(){
            @Override
            public void run() {
                try{
                    int waited = 0;
                    while(waited<2000){
                        sleep(100);
                        waited+=100;
                    }
                   Intent intent = new Intent(Splash.this,PhoneAuthActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                    Splash.this.finish();
                }catch(InterruptedException e){
                    //nothing
                }finally {
                    Splash.this.finish();
                }
            }
        };

        splashThread.start();
    }
}

