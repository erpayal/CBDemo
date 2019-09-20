package com.example.cbdemo.service;

import com.example.cbdemo.model.entity.People;
import com.example.cbdemo.model.entity.Rooms;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("people")
    Call<List<People>> getPeople();

    @GET("rooms")
    Call<List<Rooms>> getRooms();
}
