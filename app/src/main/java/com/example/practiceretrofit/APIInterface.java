package com.example.practiceretrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

//Step-1 create API interface

public interface APIInterface {

   String base_URL="https://corona.lmao.ninja/v2/";

   @GET("countries")
   Call<List<Pojo>> getcountrydata();
}
