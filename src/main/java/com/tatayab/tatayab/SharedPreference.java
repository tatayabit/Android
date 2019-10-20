package com.tatayab.tatayab;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class SharedPreference {

    public static void setUserId(Context context, String UserId, int value) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putInt(UserId, value).commit();
    }

    public static int getUserId(Context context, String UserId) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        return preferences.getInt(UserId,-1);
    }

    public static void setProfileId(Context context, String ProfileId, String value) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString(ProfileId, value).commit();
    }

    public static String getProfileId(Context context, String ProfileId) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        return preferences.getString(ProfileId, "");
    }

    public static void setFirstName(Context context, String FirstName, String value) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString(FirstName, value).commit();
    }
    public static void setLastname(Context context, String Lastname, String value) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString(Lastname, value).commit();
    }
    public static String getFirstName(Context context, String FirstName) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        return preferences.getString(FirstName, "");
    }
    public static String getLastname(Context context, String Lastname) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        return preferences.getString(Lastname, "");
    }

}

