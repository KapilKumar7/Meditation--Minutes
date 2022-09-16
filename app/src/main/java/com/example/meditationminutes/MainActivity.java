package com.example.meditationminutes;


import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {


    private Button ring;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ring=findViewById(R.id.button);
        final MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.gong);

        ring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Timer t =new Timer();
                TimerTask tt = new TimerTask() {
                    @Override
                    public void run() {
                        mediaPlayer.start();
                    }
                };

                t.schedule(tt,0,100000);


            }
        });
    }
}