package com.example.smd8a_anim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    View first, second, third, fourth, fifth, sixth;
    ImageView ivLogo;
    TextView tvSlogan;
    Animation header_anim, slogan_anim, bouncing_ball, first_a, second_a, third_a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        first.setAnimation(first_a);
        second.setAnimation(second_a);
        third.setAnimation(third_a);
        fourth.setAnimation(first_a);
        fifth.setAnimation(header_anim);
        sixth.setAnimation(header_anim);
        ivLogo.setAnimation(bouncing_ball);
        tvSlogan.setAnimation(slogan_anim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(intent);
                finish();
            }
        }, 5000);



    }

    public void init()
    {
        first = findViewById(R.id.firstLine);
        second = findViewById(R.id.secondLine);
        third = findViewById(R.id.thirdLine);
        fourth = findViewById(R.id.fourthLine);
        fifth = findViewById(R.id.fifthLine);
        sixth = findViewById(R.id.sixthLine);
        tvSlogan = findViewById(R.id.tvSlogan);
        ivLogo = findViewById(R.id.ivLogo);
        header_anim = AnimationUtils.loadAnimation(this, R.anim.header_anim);
        first_a = AnimationUtils.loadAnimation(this, R.anim.first);
        second_a = AnimationUtils.loadAnimation(this, R.anim.second);
        third_a = AnimationUtils.loadAnimation(this, R.anim.third);
        bouncing_ball = AnimationUtils.loadAnimation(this, R.anim.bouncing_ball);
        slogan_anim = AnimationUtils.loadAnimation(this, R.anim.slogan_anim);


    }
}