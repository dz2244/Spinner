package com.example.spinner;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    TextView tvFN,tvLN,tvBD,tvPN;
    ListView lv;
    Spinner spinner;

    String [] arr = { "amir", "idan", "doron","deadpool", "nadav", "alvira","aylon", "eden", "adva","lior" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvFN = findViewById(R.id.tvFN);
        tvLN = findViewById(R.id.tvLN);
        tvBD = findViewById(R.id.tvBD);
        tvPN = findViewById(R.id.tvPN);
        lv = findViewById(R.id.lv);
        spinner = findViewById(R.id.spinner);
        ArrayAdapter<String> adp = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item ,arr);
        lv.setAdapter(adp);
        for(int i=0;i<10;i++){

        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}