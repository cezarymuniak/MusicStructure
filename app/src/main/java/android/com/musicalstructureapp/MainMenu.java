package android.com.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

/**
 * Created by czare on 17.04.2018.
 */

public class MainMenu extends AppCompatActivity {
    CardView playerCardView;
    final View.OnClickListener playerTextViewOnClickListener = new View.OnClickListener() {
        public void onClick(final View v) {
            openPlayerList(playerCardView);
        }
    };
    CardView albumsCardView;
    final View.OnClickListener albumsTextViewOnClickListener = new View.OnClickListener() {
        public void onClick(final View v) {
            openAlbumsList(albumsCardView);
        }
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

        playerCardView = (CardView) findViewById(R.id.menuPlayer);
        albumsCardView = (CardView) findViewById(R.id.menuAlbums);
        playerCardView.setOnClickListener(playerTextViewOnClickListener);
        albumsCardView.setOnClickListener(albumsTextViewOnClickListener);
    }

    public void openAlbumsList(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openPlayerList(View view) {
        Intent intent = new Intent(this, PlayerActivity.class);
        startActivity(intent);
    }


}
