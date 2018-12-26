package com.example.android.space_animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn;
    ImageView astro, rocket, meteor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);

        astro = findViewById(R.id.astro);
        rocket = findViewById(R.id.rocket);
        meteor = findViewById(R.id.meteor);

        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Animation anim_astro = AnimationUtils.loadAnimation(MainActivity.this, R.anim.mixed_anim);

        Animation anim_rocket = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rocket);

        Animation anim_meteor = AnimationUtils.loadAnimation(MainActivity.this, R.anim.meteor);


        astro.startAnimation(anim_astro);
        rocket.startAnimation(anim_rocket);
        meteor.startAnimation(anim_meteor);

    }
}
