package com.neel.mvvmsampleapp2.service;

import com.neel.mvvmsampleapp2.Model.BlogWrapper;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RestApiService {

    @GET("feed.json")
    Call<BlogWrapper> getPopularBlog();
}
