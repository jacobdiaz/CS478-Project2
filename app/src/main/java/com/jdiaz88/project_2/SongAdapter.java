package com.jdiaz88.project_2;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
// Image files are stored under app > src > main > res > drawable-hdpi (View it in finder)

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.MyViewHolder> {
    private ArrayList<Song> songList;

    // index of images array corresponds to order/position it is explicitly generated in MainActivity
    private int[] images = { R.drawable.power, R.drawable.chanel, R.drawable.ten, R.drawable.areyouboredyet, R.drawable.afterthestorm,R.drawable.photo,R.drawable.cyanide, R.drawable.thespins, R.drawable.chronicsunshine};

    public SongAdapter(ArrayList<Song> songList ){
        this.songList = songList;
    }

    // Create a viewholder
    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView songTitle;
        private TextView artistName;
        private ImageView albumCover;


        public MyViewHolder(final View view){
            super(view);
            // Linking the UI elements from song_item.xml
            songTitle = view.findViewById(R.id.song_title);
            artistName = view.findViewById(R.id.song_artist);
            albumCover = view.findViewById(R.id.album_cover);

            // On long click
            itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    Toast.makeText(v.getContext(), "Position is" + getAdapterPosition(),Toast.LENGTH_SHORT).show();
                    return false;
                }
            });
        }
    }


    @NonNull
    @Override
    public SongAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate our view
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.song_item, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SongAdapter.MyViewHolder holder, int position) {
        String song = songList.get(position).getSongTitle();
        String artist = songList.get(position).getArtistName();

        int image_id = images[position];

        holder.songTitle.setText(song);
        holder.artistName.setText(artist);
        holder.albumCover.setImageResource(image_id);
    }

    @Override
    public int getItemCount() {
        return songList.size();
    }
}
