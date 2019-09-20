package com.example.cbdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.QuickContactBadge;
import android.widget.TextView;

import com.example.cbdemo.databinding.ActivityDirectoryBinding;
import com.example.cbdemo.databinding.ActivityMainBinding;

public class DirectoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directory);
        ActivityDirectoryBinding activityDirectoryBinding =
                DataBindingUtil.setContentView(this, R.layout.activity_directory);


        activityDirectoryBinding.cvpeople.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(DirectoryActivity.this,MainActivity.class);
                startActivity(i);
            }
        });

        activityDirectoryBinding.cvroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(DirectoryActivity.this,RoomsActivity.class);
                startActivity(i);
            }
        });


    }
}

