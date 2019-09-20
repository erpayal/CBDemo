package com.example.cbdemo.repository;

import com.example.cbdemo.model.entity.People;
import com.example.cbdemo.model.entity.Rooms;
import com.example.cbdemo.service.Api;
import com.example.cbdemo.service.ApiService;

import java.util.List;

import javax.inject.Inject;

import androidx.lifecycle.MutableLiveData;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PeopleRepository {


    private ApiService apiService;

    public PeopleRepository() {

        apiService = Api.createService(ApiService.class);
    }

    public MutableLiveData<List<People>> getPeople() {
        final MutableLiveData<List<People>> peopleData = new MutableLiveData<>();
        apiService.getPeople().enqueue(new Callback<List<People>>() {
           @Override
           public void onResponse(Call<List<People>> call, Response<List<People>> response) {
               if (response.isSuccessful()) {

                   peopleData.setValue(response.body());


               }
           }

           @Override
           public void onFailure(Call<List<People>> call, Throwable t) {

           }
       });

       return peopleData;
    }
    public MutableLiveData<List<Rooms>> getRooms() {
        final MutableLiveData<List<Rooms>> roomData = new MutableLiveData<>();
        apiService.getRooms().enqueue(new Callback<List<Rooms>>() {
            @Override
            public void onResponse(Call<List<Rooms>> call, Response<List<Rooms>> response) {
                if (response.isSuccessful()) {

                    roomData.setValue(response.body());


                }
            }

            @Override
            public void onFailure(Call<List<Rooms>> call, Throwable t) {

            }
        });

        return roomData;
    }
}
