package com.frank.haikaltrainning;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class PlayAudioHaikal extends AppCompatActivity {
    ImageButton mainkan;
    TextView keterangan;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_audio_haikal);

        keterangan = (TextView)findViewById(R.id.ket);
        keterangan.setText("Silahkan Klik Tombol Play");

        mainkan = (ImageButton)findViewById(R.id.putarMusik);
        mainkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainkan.setEnabled(false);
                keterangan.setText("Tombol play tidak aktif");
                go();
            }
        });
    }
    public void go(){

    }
}
