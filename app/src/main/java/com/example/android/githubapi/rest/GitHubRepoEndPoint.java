package com.example.android.githubapi.rest;

import com.example.android.githubapi.model.GitHubRepo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Milind Amrutkar on 10-03-2019.
 */
public interface GitHubRepoEndPoint {

    @GET("/users/{user}/repos")
    Call<List<GitHubRepo>> getRepo(@Path("user") String name);
}
