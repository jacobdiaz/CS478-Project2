package com.jdiaz88.project_2;
// Jacob Diaz
// jdiaz88@uic.edu
// Project 2 - CS 478 Hallenbeck
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
<<<<<<< HEAD
import android.widget.TextView;
import android.widget.Toast;
=======
import android.view.View;
>>>>>>> parent of 2f48a95... Added wiki url to song object

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

        //F
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
        songList.add(new Song("Power","Kanye West","https://www.youtube.com/watch?v=SUtf9Ajlno4"));
        songList.add(new Song("Chanel","Frank Ocean","https://www.youtube.com/watch?v=MRyNOYrt6Wc"));
        songList.add(new Song("10 Years Ago","FKJ","https://www.youtube.com/watch?v=rqScfATfNnc"));
        songList.add(new Song("Are You Bored Yet?(feat. Clairo)","Wallows,Clairo","https://www.youtube.com/watch?v=wjbAsm48oTA"));
        songList.add(new Song("After the Storm","Tyler the Creator, Kali Uchis","https://www.youtube.com/watch?v=6VwC2P_gYGg"));
        songList.add(new Song("Photosynthesis","Saba, Jean Deaux","https://www.youtube.com/watch?v=3Oi13wz1KlA"));
        songList.add(new Song("CYANIDE","Daniel Caesar","https://www.youtube.com/watch?v=09J5ttP2YDM"));
        songList.add(new Song("The Spins","Mac Miller","https://www.youtube.com/watch?v=mkGT1c98soU"));
        songList.add(new Song("Chronic Sunshine","Cosmo Pyke","https://www.youtube.com/watch?v=iOSSAQPt-Ro"));
    }
<<<<<<< HEAD
=======

    @Override
    public void onSongClicked(int position) {
        final Song clickedSong = songList.get(position);
        Log.d("clickedSong","Clicked "+clickedSong.getSongUrl()+" ");
//        // Navigate to a new activity
//        Intent i = new Intent(Intent.ACTION_VIEW);
//        i.setData((Uri.parse(clickedSong.getSongUrl())));
//        startActivity(i);
        Uri uri = Uri.parse(clickedSong.getSongUrl());
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
>>>>>>> parent of 2f48a95... Added wiki url to song object
}
// Song Image Resources
//https://www.google.com/url?sa=i&url=https%3A%2F%2Fgenius.com%2FDaniel-caesar-cyanide-lyrics&psig=AOvVaw2rLIjTfugsWJRuUwd9aYDr&ust=1614294954885000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLjMpL3Tg-8CFQAAAAAdAAAAABAD
//https://www.google.com/url?sa=i&url=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FK.I.D.S._(mixtape)&psig=AOvVaw2BK0qI_HdwBkz-iCECXrVh&ust=1614295165978000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLDNtaLUg-8CFQAAAAAdAAAAABAD
