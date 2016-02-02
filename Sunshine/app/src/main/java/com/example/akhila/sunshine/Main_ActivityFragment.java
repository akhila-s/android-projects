package com.example.akhila.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class Main_ActivityFragment extends Fragment {

    private ArrayAdapter<String> mForecastAdapter;
    public Main_ActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootview =  inflater.inflate(R.layout.fragment_main_, container, false);

        String[] forecastArray = {
                "Today - Sunny - 88/63",
                "Tomorrow - Foggy - 70/40",
                "Wednesday - Cloudy - 72/63",
                "Thursday - Asteroids - 75/65",
                "Friday - Heavy Rain - 65/56",
                "Saturday - HELP TRAPPED IN WEATHER STATION - 60/51",
                "Sunday - Sunny - 80/68"
        };

        List<String> weekForecast = new ArrayList<String>(Arrays.asList(forecastArray));
        mForecastAdapter = new ArrayAdapter<String>(
                        getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textview,
                weekForecast);

        ListView listView = (ListView) rootview.findViewById(
                R.id.listview_forecast);
        listView.setAdapter(mForecastAdapter);
        return rootview;
    }
}
