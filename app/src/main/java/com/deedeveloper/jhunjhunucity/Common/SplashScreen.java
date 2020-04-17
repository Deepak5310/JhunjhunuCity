package com.deedeveloper.jhunjhunucity.Common;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.deedeveloper.jhunjhunucity.R;
import com.deedeveloper.jhunjhunucity.User.UserDashboard;

public class SplashScreen extends AppCompatActivity {

    private static int SPLASH_TIMER = 5000;

    // Variables
    ImageView splashImage;
    TextView poweredByText;

    // Animations
    Animation sideAnim, botomAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splash_screen);

        // Hooks
        splashImage = findViewById(R.id.splash_Image);
        poweredByText = findViewById(R.id.powered_By);

        // Animations
        sideAnim = AnimationUtils.loadAnimation(this, R.anim.side_anim);
        botomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_anim);

        // set Animations on elements
        splashImage.setAnimation(sideAnim);
        poweredByText.setAnimation(botomAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(SplashScreen.this, OnBoarding.class);
                startActivity(intent);
                finish();

            }
        }, SPLASH_TIMER);
    }
}
