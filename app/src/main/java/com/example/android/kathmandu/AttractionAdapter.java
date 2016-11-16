package com.example.android.kathmandu;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by tyrone3 on 14.11.16.
 */

public class AttractionAdapter extends ArrayAdapter<Attraction> {

    int mColorResourceId;

    private class ViewHolder {
        TextView title;
        TextView previewText;
        ImageView picture;
        View textContainer;
    }

    public AttractionAdapter(Activity context, ArrayList<Attraction> attractions, int colorResourceId) {
        super(context, 0, attractions);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null) {
            holder = new ViewHolder();
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
            holder.title = (TextView) convertView.findViewById(R.id.title_text_view);
            holder.previewText = (TextView) convertView.findViewById(R.id.preview_text_view);
            holder.picture = (ImageView) convertView.findViewById(R.id.list_item_picture);
            holder.textContainer = convertView.findViewById(R.id.list_item_linear_layout_background_color);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.title.setText(getItem(position).getTitle());
        holder.previewText.setText(getItem(position).getPreviewText());
        holder.picture.setImageResource(getItem(position).getImageResourceId());
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        holder.textContainer.setBackgroundColor(color);
        return convertView;
    }
}
