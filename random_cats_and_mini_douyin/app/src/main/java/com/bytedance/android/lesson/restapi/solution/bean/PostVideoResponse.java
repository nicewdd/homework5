package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

/**
 * @author Xavier.S
 * @date 2019.01.18 17:53
 */
public class PostVideoResponse {

    // TODO-C2 (3) Implement your PostVideoResponse Bean here according to the response json

    @SerializedName("url") private String url;
    @SerializedName("success") private Boolean success;

    public Boolean getSuccess() {
        return success;
    }

    public String getUrl() {
        return url;
    }

}
