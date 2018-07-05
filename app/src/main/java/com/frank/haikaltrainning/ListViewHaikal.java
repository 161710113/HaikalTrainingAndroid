package com.frank.haikaltrainning;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewHaikal extends AppCompatActivity implements AdapterView.OnItemClickListener{
    TextView seleksi;
    String[] pilihan = { "Jerman","China","Portugal","Spanyol","Argentina","Brazil","Rusia","Inggris","Prancis",
        "Islandia","Kroasia","Swedia","Swiss","Polandia","Italia","Belanda" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_haikal);
        ListView list = findViewById(R.id.list);
//        pilihan = new ArrayList<>();
//        getData();
        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,pilihan);
        list.setAdapter(adapter);
//        setListAdapter(new ArrayAdapter<String>
//                (this,android.R.layout.simple_list_item_1, pilihan));
        seleksi = (TextView) findViewById(R.id.yangDipilih);
        list.setOnItemClickListener(this);
    }
    @Override
    public void onItemClick(AdapterView parent,View v,int position,long id){
        seleksi.setText(pilihan[position]);
    }
//    public void onListItemClick(ListView parent, View v, int position, long id) {
//        seleksi.setText(pilihan[position]);
//    }
}
