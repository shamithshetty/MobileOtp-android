package com.example.bchat.Intro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.example.bchat.MainActivity;
import com.example.bchat.R;
import com.google.firebase.auth.FirebaseAuth;

public class SplashActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT=1000;
    private FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        // Making notification bar transparent
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
            getWindow().setStatusBarColor(getResources().getColor(android.R.color.white));
        }
        //Get Firebase auth instance
        auth = FirebaseAuth.getInstance();
        //delay code
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent Homeintent;
                if (auth.getCurrentUser() != null){
                    Homeintent=new Intent(SplashActivity.this,MainActivity.class);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.stay);
                }else{
                    Homeintent=new Intent(SplashActivity.this, IntroActivity.class);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.stay);
                }
                startActivity(Homeintent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}