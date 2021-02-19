package com.jdiaz88.project_2;
// Jacob Diaz
// jdiaz88@uic.edu
// Project 2 - CS 478 Hallenbeck
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Song> songList;
    private RecyclerView songRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide(); // Hides the title bar

        songRecyclerView = findViewById(R.id.rvSongs);
        songList = new ArrayList<>();

        // Explicitly populating song list
        generateSongList();

        // Setup adapter for song list
        setupAdapter();
    }

    private void setupAdapter(){
        // Instantiate adapter
        SongAdapter sAdapter = new SongAdapter(songList);

        // Set up layout manager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        songRecyclerView.setLayoutManager(layoutManager);

        // Set up animator
        songRecyclerView.setItemAnimator(new DefaultItemAnimator());

        // Set up adapter
        songRecyclerView.setAdapter(sAdapter);
    }

    private void generateSongList(){
        songList.add(new Song("Power","Kanye West","","#"));
        songList.add(new Song("Chanel","Frank Ocean","","#"));
        songList.add(new Song("10 Years Ago","FKJ","","#"));
        songList.add(new Song("Are You Bored Yet?(feat. Clairo)","Wallows,Clairo","","#"));
        songList.add(new Song("After the Storm","Tyler the Creator, Kali Uchis","","#"));
        songList.add(new Song("Photosynthesis","Saba, Jean Deaux","","#"));
    }
}