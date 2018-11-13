package com.example.justin.trainstationapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.justin.walkingtourapp.R;

import java.util.ArrayList;

public class TrainStationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.station_list);

//        getActionBar().setDisplayHomeAsUpEnabled(true);


        final ArrayList<Station> stations = new ArrayList<Station>();


        stations.add(new Station("North Station", "Fitchburg"));
        stations.add(new Station("Porter", "Fitchburg"));
        stations.add(new Station("Belmont", "Fitchburg"));
        stations.add(new Station("Waverley", "Fitchburg"));
        stations.add(new Station("Waltham", "Fitchburg"));
        stations.add(new Station("Brandeis/Roberts", "Fitchburg"));
        stations.add(new Station("Kendal Green", "Fitchburg"));
        stations.add(new Station("Lincoln", "Fitchburg"));
        stations.add(new Station("Concord", "Fitchburg"));
        stations.add(new Station("West Concord", "Fitchburg"));
        stations.add(new Station("South Acton", "Fitchburg"));
        stations.add(new Station("Littleton/Rte. 495", "Fitchburg"));
        stations.add(new Station("Ayer", "Fitchburg"));
        stations.add(new Station("Shirley", "Fitchburg"));
        stations.add(new Station("North Leominster", "Fitchburg"));
        stations.add(new Station("Fitchburg", "Fitchburg"));
        stations.add(new Station("Wachusett", "Fitchburg"));


        StationAdapter StationAdapter = new StationAdapter(this, stations);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(StationAdapter);

    }
}
