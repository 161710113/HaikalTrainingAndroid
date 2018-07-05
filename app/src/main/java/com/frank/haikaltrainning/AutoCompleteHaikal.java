package com.frank.haikaltrainning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

import com.frank.haikaltrainning.R;

public class AutoCompleteHaikal extends AppCompatActivity implements TextWatcher{
    /** dipanggil saat activity pertama dibuat **/
    TextView hasil;
    AutoCompleteTextView edit;
    String[] item = { "Jawa Barat", "Jawa Timur", "Jawa Tengah", "Jakarta","Sumatra","Sulawesi", "Papua", "NTT", "NTB",
            "Bali","Madura","Banten", "Palembang", "Samarinda" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_haikal);

        hasil = (TextView) findViewById(R.id.hasil);
        edit = (AutoCompleteTextView) findViewById(R.id.edit);
        edit.addTextChangedListener(this);
        edit.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, item));
    }
    public void onTextChanged(CharSequence s, int start, int
            before, int count) {
        hasil.setText(edit.getText());
    }
    public void beforeTextChanged(CharSequence s, int start, int
            count, int after) {
        //gak kepake
    }
    public void afterTextChanged(Editable s) {
        // gak kepake
    }
}
