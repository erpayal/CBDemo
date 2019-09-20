package com.example.cbdemo.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.cbdemo.R;
import com.example.cbdemo.databinding.PeopleitemBinding;
import com.example.cbdemo.model.entity.People;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.inject.Inject;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

public class PeopleAdapter extends RecyclerView.Adapter<PeopleAdapter.PeopleViewHolder> {

    private ArrayList<People> peopleList;



    @NonNull
    @Override
    public PeopleAdapter.PeopleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        PeopleitemBinding peopleItemBinding =
                DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                        R.layout.peopleitem, parent, false);
        return new PeopleViewHolder(peopleItemBinding);

    }

    @Override
    public void onBindViewHolder(@NonNull PeopleAdapter.PeopleViewHolder holder, int position) {
        People currentPeople = peopleList.get(position);
        holder.peopleitemBinding.setListmodel(currentPeople);

    }


    @Override
    public int getItemCount() {
        if (peopleList != null) {
            return peopleList.size();
        } else {
            return 0;
        }
    }

    public void setPeopleList(ArrayList<People> peopleList) {
        Collections.sort(peopleList, new Comparator<People>() {
            public int compare(People G1, People G2) {
                return G1.getFirstName().compareTo(G2.getFirstName());
            }
        });
        this.peopleList = peopleList;
        notifyDataSetChanged();
    }

    class PeopleViewHolder extends RecyclerView.ViewHolder {

        private PeopleitemBinding peopleitemBinding;

        public PeopleViewHolder(@NonNull PeopleitemBinding peopleitemBinding) {
            super(peopleitemBinding.getRoot());

            this.peopleitemBinding = peopleitemBinding;
        }
    }
}
