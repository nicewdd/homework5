package com.bytedance.android.lesson.restapi.solution.bean;

import android.util.Log;

import com.bytedance.android.lesson.restapi.solution.utils.NetworkUtils;
import com.google.gson.annotations.SerializedName;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import retrofit2.http.Url;

import static java.lang.System.in;

/**
 * @author Xavier.S
 * @date 2019.01.17 18:08
 */
public class Cat {
    // TODO-C1 (1) Implement your Cat Bean here according to the response json
    @SerializedName("id") private String id;
    @SerializedName("url") private String url;
    @SerializedName("width") private int width;
    @SerializedName("height") private int height;

    public String getId(){
        return id;
    }

    public String getUrl(){
        return url;
    }

    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }

    @Override public String toString() {
        return "Cat{" +
                "id='" + id + '\'' +
                ", url=" + url + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
