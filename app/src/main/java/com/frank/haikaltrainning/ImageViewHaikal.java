package com.frank.haikaltrainning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ImageViewHaikal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view_haikal);
    }

    public void Pindah(View view) {
        Intent intent = new Intent(ImageViewHaikal.this,TableLayoutHaikal.class);
        startActivity(intent);
    }
}
