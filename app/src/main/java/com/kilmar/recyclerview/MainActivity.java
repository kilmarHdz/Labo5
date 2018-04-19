package com.kilmar.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    SeriesAdapter adapter;
    ArrayList<Serie> series;
    LinearLayoutManager lManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        series= new ArrayList<>();

        rv = findViewById(R.id.recycler);
        rv.setHasFixedSize(true);

        lManager = new LinearLayoutManager(this);
        rv.setLayoutManager(lManager);

        prepareSeries();

        adapter = new SeriesAdapter(series);
        rv.setAdapter(adapter);
    }


    public void prepareSeries(){
        String TAG = "mensaje";
        series= new ArrayList<>();
        series.add(new Serie("Naruto","13", R.drawable.nsh, "Anime popular"));
        series.add(new Serie("One Piece","13", R.drawable.onp, "Anime popular"));
        series.add(new Serie("Boku no Hero","13", R.drawable.bkh, "Anime popular"));
    }
}
