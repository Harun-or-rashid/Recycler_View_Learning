package com.example.recyclerview;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHolder> {
    private List <Movie> movieList;
public MoviesAdapter(List<Movie> movieList){
        this.movieList=movieList;
}
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view =LayoutInflater.from(parent.getContext())
            .inflate(R.layout.movie_list_row,parent,false);
    return new MyViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
                Movie movie = movieList.get(position);
                holder.title.setText(movie.getTitle());
                holder.genere.setText(movie.getGenere());
                holder.year.setText(movie.getYear());

    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView title,genere,year;


        public MyViewHolder(@NonNull View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            genere = (TextView)  view.findViewById(R.id.genre);
            year =(TextView)  view.findViewById(R.id.year);

        }
    }




}
