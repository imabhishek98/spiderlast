package com.example.temp.music_app2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by temp on 7/15/2017.
 */

public class MusicAdapter extends ArrayAdapter<Music_dt> {


    public MusicAdapter(Context context, ArrayList<Music_dt> users) {
        super(context, 0, users);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        Music_dt temp = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_layout, parent, false);
        }




        TextView s_textView = (TextView) convertView.findViewById(R.id.song_textView);
        s_textView.setText(temp.getS_name());


        TextView a_textview = (TextView) convertView.findViewById(R.id.album_textView);
        a_textview.setText(temp.getA_name());

        ImageView iconIMGview = (ImageView) convertView.findViewById(R.id.icon_imageView);
        iconIMGview.setImageResource(temp.getIMGresid());


        View listView = convertView;

        return listView;

    }
}
