package com.mygy.musicgallery;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SongRecyclerAdapter extends RecyclerView.Adapter<SongRecyclerAdapter.ViewHolder>{
    private final LayoutInflater inflater;
    private final List<Song> songs;

    public SongRecyclerAdapter(Context context, List<Song> songs) {
        this.songs = songs;
        this.inflater = LayoutInflater.from(context);
        System.out.println("FFFFFFFFF"+songs.size());
    }
    @Override
    public SongRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.song_element, parent, false);
        return new SongRecyclerAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SongRecyclerAdapter.ViewHolder holder, int position) {
        Song song = songs.get(position);

        holder.name.setText(song.getName());
        holder.author.setText(song.getAuthor());
    }

    @Override
    public int getItemCount() {
        return songs.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public final TextView name,author;
        ViewHolder(View view){
            super(view);
            name = view.findViewById(R.id.songName);
            author = view.findViewById(R.id.songAuthor);
        }
    }
}
