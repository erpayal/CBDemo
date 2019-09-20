package com.example.cbdemo.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.cbdemo.R;
import com.example.cbdemo.databinding.PeopleitemBinding;
import com.example.cbdemo.databinding.RoomitemBinding;
import com.example.cbdemo.model.entity.People;
import com.example.cbdemo.model.entity.Rooms;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

public class RoomAdapter extends RecyclerView.Adapter<RoomAdapter.RoomViewHolder> {

    private ArrayList<Rooms> roomList;



    @NonNull
    @Override
    public RoomAdapter.RoomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RoomitemBinding roomItemBinding =
                DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                        R.layout.roomitem, parent, false);
        return new RoomAdapter.RoomViewHolder(roomItemBinding);

    }

    @Override
    public void onBindViewHolder(@NonNull RoomAdapter.RoomViewHolder holder, int position) {
        Rooms currentRoom = roomList.get(position);
        holder.roomItemBinding.setRoommodel(currentRoom);

    }


    @Override
    public int getItemCount() {
        if (roomList != null) {
            return roomList.size();
        } else {
            return 0;
        }
    }

    public void setRoomsList(ArrayList<Rooms> roomList) {
        this.roomList = roomList;
        notifyDataSetChanged();
    }

    class RoomViewHolder extends RecyclerView.ViewHolder {

        private RoomitemBinding roomItemBinding;

        public RoomViewHolder(@NonNull RoomitemBinding roomItemBinding) {
            super(roomItemBinding.getRoot());

            this.roomItemBinding = roomItemBinding;
        }
    }
}
