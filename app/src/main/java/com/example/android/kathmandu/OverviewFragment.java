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
public class OverviewFragment extends Fragment {


    public OverviewFragment() {
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
        attractions.add(new Attraction(getString(R.string.restaurant_krishnarpan_title), getString(R.string.restaurant_krishnarpan_preview), getString(R.string.restaurant_krishnarpan_main), R.drawable.krishnarpan));
        attractions.add(new Attraction(getString(R.string.restaurant_chimney_title), getString(R.string.restaurant_chimney_preview), getString(R.string.restaurant_chimney_main), R.drawable.chimney));
        attractions.add(new Attraction(getString(R.string.restaurant_dwarks_title), getString(R.string.restaurant_dwarks_preview), getString(R.string.restaurant_dwarks_main), R.drawable.dwarikas_hotel));
        attractions.add(new Attraction(getString(R.string.shop_gorkha_title), getString(R.string.shop_gorkha_preview), getString(R.string.shop_gorkha_main), R.drawable.gorkha));
        attractions.add(new Attraction(getString(R.string.shop_thamel_title), getString(R.string.shop_thamel_preview), getString(R.string.shop_thamel_main), R.drawable.thamel));


        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_family);
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
