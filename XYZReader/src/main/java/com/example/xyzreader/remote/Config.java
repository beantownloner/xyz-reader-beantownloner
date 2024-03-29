package com.example.xyzreader.remote;

import android.util.Log;

import java.net.MalformedURLException;
import java.net.URL;

public class Config {
    public static final URL BASE_URL;
    private static String TAG = Config.class.toString();

    static {
        URL url = null;
        try {
            //      url = new URL("https://dl.dropboxusercontent.com/u/231329/xyzreader_data/data.json" );
            url = new URL("https://raw.githubusercontent.com/SuperAwesomeness/XYZReader/master/data.json");
        } catch (MalformedURLException ignored) {
            // TODO: throw a real error
            Log.e(TAG, "Please check your internet connection.");
        }

        BASE_URL = url;
    }
}
