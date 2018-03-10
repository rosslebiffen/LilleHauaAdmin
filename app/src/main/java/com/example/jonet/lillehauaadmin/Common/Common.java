package com.example.jonet.lillehauaadmin.Common;

import com.example.jonet.lillehauaadmin.Model.Request;
import com.example.jonet.lillehauaadmin.Model.User;
import com.example.jonet.lillehauaadmin.Remote.APIService;
import com.example.jonet.lillehauaadmin.Remote.RetrofitClient;

/**
 * Created by jonet on 27.09.2017.
 */

public class Common {

   public static final String BASE_URL = "https://fcm.googleapis.com/";
   public static final String fcmUrl = "https://fcm.googleapis.com/";
    public static APIService getFCMService()
    {
        return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }

    public static User currentUser;
    public static Request currentRequest;

    public static final String UPDATE = "Update";
    public static final String DELETE = "Delete";

    public static final int PICK_IMAGE_REQUEST = 71;

    public static String convertCodeToStatus(String code)
    {
        if(code.equals("0"))
            return "Received";
        else if(code.equals("1"))
            return "Preparing your food";
        else
            return "Done";
    }

}
