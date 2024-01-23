package com.mastercoding.themovieapp.serviceapi;

import com.google.gson.Gson;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {

    // Acts as a central configuration point for
    // defining how HTTP request and responses
    // should be handled.

    private static Retrofit retrofit = null;
    private static String BASE_URL = "https://api.themoviedb.org/3/";

    public static MovieApiService getService() {
        if ( retrofit == null ) {
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit.create(MovieApiService.class);
    }

}
