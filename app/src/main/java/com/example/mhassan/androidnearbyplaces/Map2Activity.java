package com.example.mhassan.androidnearbyplaces;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.chrisbanes.photoview.PhotoView;

public class Map2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map2);


        PhotoView photoView =  findViewById(R.id.mapView);
        photoView.setImageResource(R.drawable.map);

    }
}
