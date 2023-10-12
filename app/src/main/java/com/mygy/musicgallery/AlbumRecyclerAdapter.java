package com.mygy.musicgallery;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AlbumRecyclerAdapter extends RecyclerView.Adapter<AlbumRecyclerAdapter.ViewHolder> {
    private final LayoutInflater inflater;
    private final List<Album> albums;

    public AlbumRecyclerAdapter(Context context, List<Album> states) {
        this.albums = states;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public AlbumRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.album_element, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AlbumRecyclerAdapter.ViewHolder holder, int position) {
        Album album = albums.get(position);

        holder.albumIco.setImageResource(album.getIconRes());
        holder.name.setText(album.getName());
        holder.author.setText(album.getAuthor());
        holder.year.setText(album.getYear()+"г.");
        holder.songsNum.setText(album.getSongs().length+" композиций");
        //holder.songsNum.setText(0+" композиций");
        holder.listens.setText(album.getListens()+" прослушиваний");

        holder.root.setOnClickListener(v->{
            Intent intent = new Intent(inflater.getContext(), AlbumContent.class);
            intent.putExtra(Album.class.getSimpleName(),album);
            inflater.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return albums.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public final ImageView albumIco;
        public final TextView name,author,year,listens,songsNum;
        public final ConstraintLayout root;
        ViewHolder(View view){
            super(view);
            albumIco=view.findViewById(R.id.albumIco);
            name = view.findViewById(R.id.albumName);
            author = view.findViewById(R.id.albumAuthor);
            year = view.findViewById(R.id.albumYear);
            listens = view.findViewById(R.id.albumListens);
            songsNum = view.findViewById(R.id.albumSongsNum);
            root = view.findViewById(R.id.albumRoot);
        }
    }
}
