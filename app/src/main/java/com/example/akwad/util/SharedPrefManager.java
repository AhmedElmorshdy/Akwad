package com.example.akwad.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.content.res.Resources;

import java.util.Locale;


public class SharedPrefManager {
    private final static String SHARED_PREF_NAME = "Akwad";
    private final static String FIRST_TIME = "shared_first_time";
    private final static String country = "shared_country";
    private final static String countryName = "shared_country_name";
    private final static String APP_LANGUAGE = "aap_language";
//    private static final String ORDER_STATUS_MODE = "ORDER_STATUS_MODE";
Editor mEditor;

    private Context mContext;
    //    private SharedPrefManager mInstance ;
    private SharedPreferences mSharedPreferences;

    public SharedPrefManager(Context context) {
        mContext = context;
        mSharedPreferences = mContext.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        mEditor = mSharedPreferences.edit();

    }


    public String getLanguage() {
        String value = "";

        if (Locale.getDefault().getLanguage().equals("en"))
            value = mSharedPreferences.getString(APP_LANGUAGE, "en");

        else if (Locale.getDefault().getLanguage().equals("ar"))
            value = mSharedPreferences.getString(APP_LANGUAGE, "ar");

        return value;
    }

    public void setLanguage(String language) {
        Resources res = mContext.getResources();
        Locale locale = new Locale(language);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        res.updateConfiguration(config, res.getDisplayMetrics());
        mEditor.putString(APP_LANGUAGE, language);
        mEditor.apply();
    }

    public boolean getFirstTime() {
        return mSharedPreferences.getBoolean(FIRST_TIME, true);
    }

    public void setFirstTime(boolean status) {
        Editor mEditor = mSharedPreferences.edit();
        mEditor.putBoolean(FIRST_TIME, status);
        mEditor.apply();
    }

    public int getCountryId() {
        return mSharedPreferences.getInt(country, 1);
    }
    public String getCountryName() {
        return mSharedPreferences.getString(countryName,"" );
    }

    public void setCountry(int id) {
        Editor mEditor = mSharedPreferences.edit();
        mEditor.putInt(country, id);
        mEditor.apply();
    }
    public void setCountry(String name ) {
        Editor mEditor = mSharedPreferences.edit();
        mEditor.putString(countryName, name);
        mEditor.apply();
    }

}
