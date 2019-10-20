package com.tatayab.tatayab.Utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Patterns;

public class Utils {

    //Developement url
    public  static String BASE_URL = "http://dev2.tatayab.com/api/4.0/" ;
    public static  String AuthorizationKey = "Basic ZGV2MkB0YXRheWFiLmNvbTpnc2gzNHBzME4yRFg1cVMzeTBQMDlVMjIwaDE1SE04VA==";

    //Method for Connection
    public static boolean isNetworkConnected(Context context) {
        if (context == null)
            return false;
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        return cm != null && cm.getActiveNetworkInfo() != null;
    }


    public static boolean isEmailValid(String username) {
        if (username == null) {
            return false;
        }
        if (username.contains("@")) {
            return Patterns.EMAIL_ADDRESS.matcher(username).matches();
        } else {
            return !username.trim().isEmpty();
        }
    }
}
