package com.frank.haikaltrainning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void Pindah(View view) {
        Intent intent = new Intent(Home.this,LinearLayoutHaikal.class);
        startActivity(intent);
    }
    public void Pindah2(View view) {
        Intent intent = new Intent(Home.this,RelativeLayoutHaikal.class);
        startActivity(intent);
    }
    public void Pindah3(View view) {
        Intent intent = new Intent(Home.this,TableLayoutHaikal.class);
        startActivity(intent);
    }
    public void Pindah4(View view) {
        Intent intent = new Intent(Home.this,ImageViewHaikal.class);
        startActivity(intent);
    }
    public void Pindah5(View view) {
        Intent intent = new Intent(Home.this,AutoCompleteHaikal.class);
        startActivity(intent);
    }

    public void Pindah6(View view) {
        Intent intent = new Intent(Home.this,DialogHaikal.class);
        startActivity(intent);
    }
    public void Pindah7(View view) {
        Intent intent = new Intent(Home.this,DatePickerHaikal.class);
        startActivity(intent);
    }

    public void Pindah8(View view) {
        Intent intent = new Intent(Home.this,CheckBoxHaikal.class);
        startActivity(intent);
    }

    public void Pindah9(View view) {
        Intent intent = new Intent(Home.this,RadioButtonHaikal.class);
        startActivity(intent);
    }

    public void Pindah10(View view) {
        Intent intent = new Intent(Home.this,ListViewHaikal.class);
        startActivity(intent);
    }
}
