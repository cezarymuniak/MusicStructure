package android.com.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by czare on 17.04.2018.
 */

public class PlayerActivity extends AppCompatActivity {

    private ImageButton pauseButton;
    private ImageButton playButton;
    private ImageButton stopButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_player);
        pauseButton = (ImageButton) findViewById(R.id.pausebutton);
        playButton = (ImageButton) findViewById(R.id.playbutton);
        stopButton = (ImageButton) findViewById(R.id.stopbutton);
        pauseButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(),
                        "Song is now paused", Toast.LENGTH_LONG).show();

            }
        });

        playButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(),
                        "Song is now playing", Toast.LENGTH_LONG).show();

            }
        });

        stopButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(),
                        "Song is now stopped", Toast.LENGTH_LONG).show();

            }
        });


    }
}
