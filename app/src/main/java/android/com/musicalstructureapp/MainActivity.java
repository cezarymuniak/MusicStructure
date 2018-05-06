package android.com.musicalstructureapp;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by czare on 17.04.2018.
 */

public class MainActivity extends AppCompatActivity {
    private static CustomAdapter adapter;
    ArrayList<DataModel> songData;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.list_music);
        songData = new ArrayList<>();

        songData.add(new DataModel("Song 1", "Artist", "1"));
        songData.add(new DataModel("Song 2", "Artist", "2"));
        songData.add(new DataModel("Song 3", "Artist", "3"));
        songData.add(new DataModel("Song 4", "Artist", "4"));
        songData.add(new DataModel("Song 5", "Artist", "5"));
        songData.add(new DataModel("Song 6", "Artist", "6"));
        songData.add(new DataModel("Song 7", "Artist", "7"));
        songData.add(new DataModel("Song 8", "Artist", "8"));
        songData.add(new DataModel("Song 9", "Artist", "9"));
        songData.add(new DataModel("Song 10", "Artist", "10"));
        songData.add(new DataModel("Song 11", "Artist", "11"));
        songData.add(new DataModel("Song 12", "Artist", "12"));
        songData.add(new DataModel("Song 13", "Artist", "13"));
        songData.add(new DataModel("Song 14", "Artist", "14"));
        songData.add(new DataModel("Song 15", "Artist", "15"));
        songData.add(new DataModel("Song 16", "Artist", "16"));
        songData.add(new DataModel("Song 17", "Artist", "17"));
        songData.add(new DataModel("Song 18", "Artist", "18"));

        adapter = new CustomAdapter(songData, getApplicationContext());
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                DataModel dataModel = songData.get(position);
                Snackbar.make(view, dataModel.getName() + "\n" + dataModel.getType(), Snackbar.LENGTH_LONG)
                        .setAction("No action", null).show();
            }
        });

    }

}
