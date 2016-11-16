package com.example.android.kathmandu;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SightseeingFragment extends Fragment {


    public SightseeingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);
        final ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(getString(R.string.sight_bodnath_title), getString(R.string.sight_bodnath_preview), getString(R.string.sight_bodnath_main), R.drawable.bodnath));
        attractions.add(new Attraction(getString(R.string.sight_swayambhunath_title), getString(R.string.sight_swayambhunath_preview), getString(R.string.sight_swayambhunath_main), R.drawable.swayambhunath));
        attractions.add(new Attraction(getString(R.string.sight_pashupatinath_title), getString(R.string.sight_pashupatinath_preview), getString(R.string.sight_pashupatinath_main), R.drawable.pashupatinath));
        attractions.add(new Attraction(getString(R.string.sight_bodnath_title), getString(R.string.sight_bodnath_preview), getString(R.string.sight_bodnath_main), R.drawable.bodnath));
        attractions.add(new Attraction(getString(R.string.sight_swayambhunath_title), getString(R.string.sight_swayambhunath_preview), getString(R.string.sight_swayambhunath_main), R.drawable.swayambhunath));
        attractions.add(new Attraction(getString(R.string.sight_pashupatinath_title), getString(R.string.sight_pashupatinath_preview), getString(R.string.sight_pashupatinath_main), R.drawable.pashupatinath));
        attractions.add(new Attraction(getString(R.string.sight_bodnath_title), getString(R.string.sight_bodnath_preview), getString(R.string.sight_bodnath_main), R.drawable.bodnath));
        attractions.add(new Attraction(getString(R.string.sight_swayambhunath_title), getString(R.string.sight_swayambhunath_preview), getString(R.string.sight_swayambhunath_main), R.drawable.swayambhunath));
        attractions.add(new Attraction(getString(R.string.sight_pashupatinath_title), getString(R.string.sight_pashupatinath_preview), getString(R.string.sight_pashupatinath_main), R.drawable.pashupatinath));
        attractions.add(new Attraction(getString(R.string.sight_bodnath_title), getString(R.string.sight_bodnath_preview), getString(R.string.sight_bodnath_main), R.drawable.bodnath));
        attractions.add(new Attraction(getString(R.string.sight_swayambhunath_title), getString(R.string.sight_swayambhunath_preview), getString(R.string.sight_swayambhunath_main), R.drawable.swayambhunath));
        attractions.add(new Attraction(getString(R.string.sight_pashupatinath_title), getString(R.string.sight_pashupatinath_preview), getString(R.string.sight_pashupatinath_main), R.drawable.pashupatinath));


        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_phrases);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(getActivity(), OneAttractionActivity.class);
                Attraction currentAttraction = attractions.get(position);
                intent.putExtra("currentAttraction", currentAttraction);
                getActivity().startActivity(intent);
            }
        });
        return rootView;
    }

}
