package com.example.cbdemo.viewmodel;

import android.app.Application;

import com.example.cbdemo.model.entity.People;
import com.example.cbdemo.model.entity.Rooms;
import com.example.cbdemo.repository.PeopleRepository;

import java.util.List;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

public class MainViewModel extends AndroidViewModel {

    PeopleRepository peopleRepository;
    LiveData<List<People>> allPeople;

    public MainViewModel(Application application) {
       super(application);
        peopleRepository=new PeopleRepository();


    }

    public LiveData<List<People>> getPeople() {
        return peopleRepository.getPeople();
    }

    public LiveData<List<Rooms>> getRooms() {
        return peopleRepository.getRooms();
    }
}
