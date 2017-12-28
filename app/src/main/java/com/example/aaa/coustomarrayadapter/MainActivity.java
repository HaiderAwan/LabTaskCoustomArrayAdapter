package com.example.aaa.coustomarrayadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import static android.R.attr.data;

public class MainActivity extends AppCompatActivity {

    ContactInfo[] contactInfo = {
            new ContactInfo("name" + 0, "phone" + 0), new ContactInfo("name" + 01 ,"phone" + 01),
            new ContactInfo("name" + 02, "phone" + 02), new ContactInfo("name" + 03, "phone" + 03),
            new ContactInfo("name" + 04, "phone" + 04), new ContactInfo("name" + 05, "phone" + 05),
            new ContactInfo("name" + 06, "phone" + 06), new ContactInfo("name" + 07, "phone" + 07),
            new ContactInfo("name" + 8, "phone" + 8), new ContactInfo("name" + 9, "phone" + 9)};

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView= (ListView) findViewById(R.id.listview1);
    }
}
