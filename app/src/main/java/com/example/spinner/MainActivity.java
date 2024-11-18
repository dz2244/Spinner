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

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, AdapterView.OnItemClickListener{
    TextView tvFN,tvLN,tvBD,tvPN;
    ListView lv;
    Spinner spinner;

    String[] names1 = { "amir killer", "idan ddkkddk", "doron smith", "deadpool xoxo", "nadav hunter", "alvira moon", "aylon storm", "eden blaze", "adva shadow", "lior viper" };
    String[] names2 = { "michael fox", "noa blue", "gili emerald", "shira royal", "yair wolf", "daniel steel", "ron phoenix", "yael frost", "ziv star", "maya dream" };
    String[] names3 = { "omer dark", "tomer king", "guy ocean", "neta flame", "shani shadow", "itai storm", "gilad sun", "hila star", "ella blaze", "avi night" };
    String[] names4 = { "dana blue", "erez light", "yuval thunder", "tal mystic", "shay frost", "arina wolf", "yoni flame", "aviv storm", "lea dark", "nir fire" };
    String [] classes = { "chose class", "class1", "class2", "class3", "class4"};

    String[] birthdays1 = { "01/01/1990", "02/02/1991", "03/03/1992", "04/04/1993", "05/05/1994", "06/06/1995", "07/07/1996", "08/08/1997", "09/09/1998", "10/10/1999" };
    String[] birthdays2 = { "11/11/1985", "12/12/1986", "13/01/1987", "14/02/1988", "15/03/1989", "16/04/1990", "17/05/1991", "18/06/1992", "19/07/1993", "20/08/1994" };
    String[] birthdays3 = { "21/09/1980", "22/10/1981", "23/11/1982", "24/12/1983", "25/01/1984", "26/02/1985", "27/03/1986", "28/04/1987", "29/05/1988", "30/06/1989" };
    String[] birthdays4 = { "31/07/1975", "01/08/1976", "02/09/1977", "03/10/1978", "04/11/1979", "05/12/1980", "06/01/1981", "07/02/1982", "08/03/1983", "09/04/1984" };

    String[] phoneNumbers1 = { "050-1234567", "050-2345678", "050-3456789", "050-4567890", "050-5678901", "050-6789012", "050-7890123", "050-8901234", "050-9012345", "050-0123456" };
    String[] phoneNumbers2 = { "052-1112222", "052-2233445", "052-3344556", "052-4455667", "052-5566778", "052-6677889", "052-7788990", "052-8899001", "052-9900112", "052-1011123" };
    String[] phoneNumbers3 = { "054-3334444", "054-4445555", "054-5556666", "054-6667777", "054-7778888", "054-8889999", "054-9990000", "054-1002003", "054-2003004", "054-3004005" };
    String[] phoneNumbers4 = { "053-9876543", "053-8765432", "053-7654321", "053-6543210", "053-5432109", "053-4321098", "053-3210987", "053-2109876", "053-1098765", "053-0987654" };


    String selectedItem;
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

        ArrayAdapter<String> adpLv = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item ,names1);
        lv.setAdapter(adpLv);

        ArrayAdapter<String> adpS = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item ,classes);
        spinner.setAdapter(adpS);

        spinner.setOnItemSelectedListener(this);
        lv.setOnItemClickListener(this);


    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if(position == 1) {
            ArrayAdapter<String> adpLv = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item ,names1);
            lv.setAdapter(adpLv);
        }
        else if (position == 2) {
            ArrayAdapter<String> adpLv = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item ,names2);
            lv.setAdapter(adpLv);
        }
        else if (position == 3) {
            ArrayAdapter<String> adpLv = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item ,names3);
            lv.setAdapter(adpLv);
        }
        else if (position == 4) {
            ArrayAdapter<String> adpLv = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item ,names4);
            lv.setAdapter(adpLv);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        tvFN.setText("First Name: " + names1[position]);
        tvLN.setText("Last Name: " + names1[position]);
        tvBD.setText("Birth Date: " + birthdays1[position]);
        tvPN.setText("Phone Number: " + phoneNumbers1[position]);

    }
}