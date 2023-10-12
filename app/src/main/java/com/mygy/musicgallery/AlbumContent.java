package com.mygy.musicgallery;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;

/*
 * Main Activity class that loads {@link MainFragment}.
 */
public class AlbumContent extends FragmentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_content);

        TextView name = findViewById(R.id.albumContent_albumName);
        TextView author = findViewById(R.id.albumContent_albumAuthor);
        ImageView icon = findViewById(R.id.albumContent_albumIco);
        RecyclerView recyclerView = findViewById(R.id.albumContent_recyclerView);

        Bundle arguments = getIntent().getExtras();
        Album album;
        if(arguments!=null){
            album = (Album) arguments.getSerializable(Album.class.getSimpleName());
            name.setText(album.getName());
            author.setText(album.getAuthor());
            icon.setImageResource(album.getIconRes());

            SongRecyclerAdapter adapter = new SongRecyclerAdapter(this, Arrays.asList(album.getSongs()));
            recyclerView.setAdapter(adapter);
        }

    }
}