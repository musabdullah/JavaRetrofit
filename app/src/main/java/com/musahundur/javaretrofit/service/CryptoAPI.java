package com.musahundur.javaretrofit.service;

import com.musahundur.javaretrofit.model.CryptoModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {

    //https://api.nomics.com/v1/prices?key=a1b939b70454d670141e9cdf06a09de1ce2fcfb9

    @GET("prices?key=a1b939b70454d670141e9cdf06a09de1ce2fcfb9")
    Call<List<CryptoModel>> getData();

}
