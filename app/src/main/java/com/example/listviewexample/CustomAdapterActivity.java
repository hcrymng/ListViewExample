package com.example.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapterActivity extends AppCompatActivity {
    final List<Animal>  animals = new ArrayList<Animal>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_adapter);
        animals.add(new Animal("ant",R.drawable.ant));
        animals.add(new Animal("bear",R.drawable.bear));
        animals.add(new Animal("bird",R.drawable.bird));
        animals.add(new Animal("cat",R.drawable.cat));
        animals.add(new Animal("caw",R.drawable.caw));
        animals.add(new Animal("horse",R.drawable.horse));
        animals.add(new Animal("donkey",R.drawable.donkey));

        animals.add(new Animal("dog",R.drawable.dog));
        animals.add(new Animal("monkey",R.drawable.monkey));
        animals.add(new Animal("elephant",R.drawable.elephant));

        final ListView listView = (ListView) findViewById(R.id.listView);
        AnimalAdapter adapter = new AnimalAdapter(this ,animals);
        listView.setAdapter(adapter);



    }


}