package com.example.et.justphrases;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android .media.MediaPlayer;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void onClick(View view)
    {  MediaPlayer mp;

        int ID=view.getId();
        switch(ID)
        {
            case R.id.b1 :
            {
                mp = MediaPlayer.create(this, R.raw.doyouspeakenglish);
                mp.start();

                break;
            }
            case R.id .b2 :
                {
                mp = MediaPlayer.create(this, R.raw.goodevening);
                mp.start();
                break;
            }
            case R.id .b3:{
                mp = MediaPlayer.create(this, R.raw.hello);
                mp.start();
                break;
            }
            case R.id .b4:{
                mp = MediaPlayer.create(this, R.raw.howareyou);
                mp.start();
                break;
            }
            case R.id.b5:{
                mp = MediaPlayer.create(this, R.raw.ilivein);
                mp.start();
                break;
            }
            case R.id .b6:{
                mp = MediaPlayer.create(this, R.raw.mynameis);
                mp.start();
                break;
            }
            case R.id .b7:{
                mp = MediaPlayer.create(this, R.raw.please);
                mp.start();
                break;
            }
            case R.id.b8:{
                mp = MediaPlayer.create(this, R.raw.welcome);
                mp.start();
                break;
            }

        }


        }

    }

