package com.binodcoder.servicesdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button start, stop;
    TextView song;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start=(Button)findViewById(R.id.btn_start);
        stop=(Button)findViewById(R.id.btn_stop);
        song=(TextView) findViewById(R.id.song_name);
        image=(ImageView)findViewById(R.id.image);
        start.setOnClickListener(this);
        stop.setOnClickListener(this);
     }

    @Override
    public void onClick(View v) {
        if(v==start){
            song.setText("default ring tone");
            image.setImageResource(R.drawable.alarm);
            startService(new Intent(MainActivity.this, MyService.class));
        }else if(v==stop){
            stopService(new Intent(MainActivity.this, MyService.class));
        }
    }
}