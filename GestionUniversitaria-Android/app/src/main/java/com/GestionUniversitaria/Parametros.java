package com.GestionUniversitaria;


import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

public class Parametros extends Application{



    private static final String URLBase = "http://192.168.1.18:8080/GestionUniversitaria-BE/AndroidServlet?"; // Cambiarla segun donde se ejecute el backend


    public static String getURLBase() {
        return URLBase;
    }

    public static void saveUser(String userId, Context context){
        SharedPreferences settings = context.getSharedPreferences("user", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString("userId", userId);
        editor.commit();
    }

    public static String getUser(Context context) {
        SharedPreferences settings = context.getSharedPreferences("user", Context.MODE_PRIVATE);
        String userId = settings.getString("userId", null);
        return userId;
    }

    public static void clearUser(Context context) {
        SharedPreferences settings = context.getSharedPreferences("user", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.clear();
        editor.commit();
    }

    public static void removeUserId(Context context) {
        SharedPreferences settings = context.getSharedPreferences("user", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.remove("userId");
        editor.commit();
    }
}
