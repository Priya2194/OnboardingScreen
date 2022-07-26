package com.example.onboardingscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

public class SplashActivity extends AppCompatActivity {

    ImageView image,logo,title;
    LottieAnimationView lottie;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        image=findViewById(R.id.image);
        logo=findViewById(R.id.logo);
        title=findViewById(R.id.name);
        lottie=findViewById(R.id.lottie);

        Thread thread=new Thread()
        {
            @Override
            public void run()
            {
                try {

                    image.animate().translationY(-2400).setDuration(1000).setStartDelay(4000);
                    logo.animate().translationY(2200).setDuration(1000).setStartDelay(4000);
                    title.animate().translationY(2200).setDuration(1000).setStartDelay(4000);
                    lottie.animate().translationY(2200).setDuration(1000).setStartDelay(4000);
                    sleep(4000);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                finally {


                    Intent intent=new Intent(SplashActivity.this,MainActivity.class);
                    startActivity(intent);
                }

            }
        };thread.start();


    }
}