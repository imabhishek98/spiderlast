package com.example.temp.music_app2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<Music_dt> first_arrayList = new ArrayList<Music_dt>();


        first_arrayList.add(new Music_dt("Despacito", "Daddy Yankee", R.drawable.despacito));
        first_arrayList.add(new Music_dt("Shape of You", "Ed Sheeran", R.drawable.shapeofyou));
        first_arrayList.add(new Music_dt("Attention", "Charlie Puth", R.drawable.attention));
        first_arrayList.add(new Music_dt("Closer", "ChainSmokers", R.drawable.closerr));
        first_arrayList.add(new Music_dt("I'm the One", "DJ Khaled", R.drawable.im_the_one));


        first_arrayList.add(new Music_dt("Despacito", "Daddy Yankee", R.drawable.despacito));
        first_arrayList.add(new Music_dt("Shape of You", "Ed Sheeran", R.drawable.shapeofyou));
        first_arrayList.add(new Music_dt("Attention", "Charlie Puth", R.drawable.attention));
        first_arrayList.add(new Music_dt("Closer", "ChainSmokers", R.drawable.closerr));
        first_arrayList.add(new Music_dt("I'm the One", "DJ Khaled", R.drawable.im_the_one));

        first_arrayList.add(new Music_dt("Despacito", "Daddy Yankee", R.drawable.despacito));
        first_arrayList.add(new Music_dt("Shape of You", "Ed Sheeran", R.drawable.shapeofyou));
        first_arrayList.add(new Music_dt("Attention", "Charlie Puth", R.drawable.attention));
        first_arrayList.add(new Music_dt("Closer", "ChainSmokers", R.drawable.closerr));
        first_arrayList.add(new Music_dt("I'm the One", "DJ Khaled", R.drawable.im_the_one));


        MusicAdapter musicAdapter = new MusicAdapter(this, first_arrayList);


        ListView listView = (ListView) findViewById(R.id.first_list_view);


        listView.setAdapter(musicAdapter);




    }





}
