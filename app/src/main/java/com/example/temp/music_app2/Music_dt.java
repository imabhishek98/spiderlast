package com.example.temp.music_app2;

/**
 * Created by temp on 7/15/2017.
 */

public class Music_dt {

    private String s_name, a_name;
    private int IMGresid;
    public Music_dt(String song_name, String album_name, int ImageResId)
    {
        s_name=song_name;
        a_name=album_name;
        IMGresid= ImageResId;
    }

    public String getS_name()
    {
        return s_name;
    }


    public String getA_name()
    {
        return a_name;
    }
    public int getIMGresid()
    {
        return IMGresid;
    }

}
