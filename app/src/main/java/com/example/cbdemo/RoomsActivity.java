package com.example.cbdemo;

import android.os.Bundle;

import com.example.cbdemo.adapter.PeopleAdapter;
import com.example.cbdemo.adapter.RoomAdapter;
import com.example.cbdemo.databinding.ActivityMainBinding;
import com.example.cbdemo.model.entity.People;
import com.example.cbdemo.model.entity.Rooms;
import com.example.cbdemo.viewmodel.MainViewModel;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class RoomsActivity extends AppCompatActivity {

    MainViewModel mainViewModel;
    RoomAdapter roomAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding =
                DataBindingUtil.setContentView(this, R.layout.activity_main);
        setSupportActionBar(activityMainBinding.toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // bind RecyclerView
        RecyclerView recyclerView = activityMainBinding.rvpeople;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        mainViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        roomAdapter=new RoomAdapter();
        recyclerView.setAdapter(roomAdapter);
        getAllRooms();
    }

    private void getAllRooms() {
        mainViewModel.getRooms().observe(this, new Observer<List<Rooms>>() {
            @Override
            public void onChanged(@Nullable List<Rooms> roomsList) {
                roomAdapter.setRoomsList((ArrayList<Rooms>)roomsList);

            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

}
