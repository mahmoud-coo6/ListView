package com.example.kaile.listview;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView MusicListView =(ListView) findViewById(R.id.MyListView);
        final ArrayList <String> MusicName = new ArrayList <String> ();
        MusicName.add("IliveIn");
        MusicName.add("MyNameIs");
        MusicName.add("Please");
        MusicName.add("Welcome");
        MusicName.add("DoYouSpeakEnglish");
        MusicName.add("Hello");
        MusicName.add("HowAreYou");
        MusicName.add("GoodEvening");
         ArrayAdapter<String> MusicAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,MusicName);
        MusicListView.setAdapter(MusicAdapter);
        MusicListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                 MediaPlayer media;
                int ResourceId = getResources().getIdentifier((MusicName.get(i)+"").toLowerCase(),"raw","com.example.kaile.listview");
                media = android.media.MediaPlayer.create(getApplicationContext(), ResourceId);
                        media.start();

            }
        });
    }
}
