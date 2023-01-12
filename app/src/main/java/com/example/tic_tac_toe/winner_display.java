package com.example.tic_tac_toe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class winner_display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner_display);
        TextView my_text=(TextView) findViewById(R.id.texty);
//       new Handler().postDelayed(new Runnable() {
//           @Override
//           public void run() {
//               Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
//               my_text.startAnimation(animation);
//           }
//       },2000);
    }
}