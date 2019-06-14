package com.noringerazancutyun.newtask;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.WindowManager;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {

    ImageView profilImage;
    ImageView avatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        profilImage = findViewById(R.id.profile_image);
        avatar = findViewById(R.id.user_image);

        Glide.with(MainActivity.this)
                .load(R.drawable.profile_image)
                .optionalCenterCrop()
                .into(profilImage);

        Glide.with(MainActivity.this)
                .load(R.drawable.circle_image)
                .circleCrop()
                .into(avatar);

    }
}
