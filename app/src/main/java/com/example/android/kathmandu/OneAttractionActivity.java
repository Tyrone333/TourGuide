package com.example.android.kathmandu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by tyrone3 on 16.11.16.
 */

public class OneAttractionActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.one_attraction);

        Intent intent = getIntent();
        Attraction currentAttraction = intent.getExtras().getParcelable("currentAttraction");
        TextView titleTextView = (TextView) findViewById(R.id.one_attraction_title_view);
        ImageView image = (ImageView) findViewById(R.id.one_attraction_image_view);
        TextView mainText = (TextView) findViewById(R.id.one_attraction_main_text_view);
        titleTextView.setText(currentAttraction.getTitle());
        image.setImageResource(currentAttraction.getImageResourceId());
        mainText.setText(currentAttraction.getMainText());

    }
}
