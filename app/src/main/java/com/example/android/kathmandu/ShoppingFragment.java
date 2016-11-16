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
public class ShoppingFragment extends Fragment {


    public ShoppingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);
        final ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(getString(R.string.shop_gorkha_title), getString(R.string.shop_gorkha_preview), getString(R.string.shop_gorkha_main), R.drawable.gorkha));
        attractions.add(new Attraction(getString(R.string.shop_thamel_title), getString(R.string.shop_thamel_preview), getString(R.string.shop_thamel_main), R.drawable.thamel));
        attractions.add(new Attraction(getString(R.string.shop_gorkha_title), getString(R.string.shop_gorkha_preview), getString(R.string.shop_gorkha_main), R.drawable.gorkha));
        attractions.add(new Attraction(getString(R.string.shop_thamel_title), getString(R.string.shop_thamel_preview), getString(R.string.shop_thamel_main), R.drawable.thamel));
        attractions.add(new Attraction(getString(R.string.shop_gorkha_title), getString(R.string.shop_gorkha_preview), getString(R.string.shop_gorkha_main), R.drawable.gorkha));
        attractions.add(new Attraction(getString(R.string.shop_thamel_title), getString(R.string.shop_thamel_preview), getString(R.string.shop_thamel_main), R.drawable.thamel));
        attractions.add(new Attraction(getString(R.string.shop_gorkha_title), getString(R.string.shop_gorkha_preview), getString(R.string.shop_gorkha_main), R.drawable.gorkha));
        attractions.add(new Attraction(getString(R.string.shop_thamel_title), getString(R.string.shop_thamel_preview), getString(R.string.shop_thamel_main), R.drawable.thamel));
        attractions.add(new Attraction(getString(R.string.shop_gorkha_title), getString(R.string.shop_gorkha_preview), getString(R.string.shop_gorkha_main), R.drawable.gorkha));
        attractions.add(new Attraction(getString(R.string.shop_thamel_title), getString(R.string.shop_thamel_preview), getString(R.string.shop_thamel_main), R.drawable.thamel));


        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_numbers);
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
