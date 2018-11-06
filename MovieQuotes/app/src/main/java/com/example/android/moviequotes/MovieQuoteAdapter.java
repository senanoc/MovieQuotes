package com.example.android.moviequotes;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MovieQuoteAdapter {

    class MovieQuoteViewHolder extends RecyclerView.Adapter<MovieQuoteAdapter.MovieQuoteViewHolder>{
        private TextView mQuoteTextView;
        private TextView mMovieTextView;

        public MovieQuoteViewHolder(@NonNull View itemView){
            super(itemView);
            mQuoteTextView = itemView.findViewById(R.id.itemview_quote);
            mMovieTextView = itemView.findViewById(R.id.itenview_movie);


        }

        @NonNull
        @Override
        public MovieQuoteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.moviequote_itemview, parent, false);
            return new MovieQuoteViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(@NonNull MovieQuoteViewHolder movieQuoteViewHolder, int i) {

        }

        @Override
        public int getItemCount() {
            return 0;
        }
    }






}
