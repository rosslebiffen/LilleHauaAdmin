package com.example.jonet.lillehauaadmin.Remote;

import com.example.jonet.lillehauaadmin.Model.DataMessage;
import com.example.jonet.lillehauaadmin.Model.MyResponse;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by Jone on 03.03.2018.
 */

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAWhUIK64:APA91bE77xFs8mmiU5pKc9FM9JK0arHWRGpwetrq69AEx1Z9Q4a7cVSVu7P1Wz2pzdIY65u-ITf_AGLCkAO5R8-eUPS2pPHKW67MwxkM0PbQK4n34SFolue89IhGNd_gXQEcf7JMIsK_"
            }

    )
    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body DataMessage body);


}
