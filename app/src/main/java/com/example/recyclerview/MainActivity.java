package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import static androidx.recyclerview.widget.RecyclerView.*;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Data arr[]=new Data[]{
            new Data(R.drawable.one,"THIS IS ONE"),
            new Data(R.drawable.two,"THIS IS TWO"),
            new Data(R.drawable.three,"THIS IS THREE"),
            new Data(R.drawable.four,"THIS IS FOUR"),
            new Data(R.drawable.five,"THIS IS FIVE"),
            new Data(R.drawable.six,"THIS IS SIX"),
            new Data(R.drawable.seven,"THIS IS SEVEN"),
            new Data(R.drawable.eight,"THIS IS EIGHT"),
            new Data(R.drawable.nine,"THIS IS NINE")};


        MyAdapter myAdapter=new MyAdapter(arr);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(myAdapter);




    }
}