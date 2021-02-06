package com.example.flixter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Parcel;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.flixter.models.Movie;

import org.parceler.Parcels;

public class DetailActivity extends AppCompatActivity {
    TextView tvTitle_2;
    TextView tvOverview;
    RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvTitle_2 = findViewById(R.id.tvTitle_2);
        tvOverview = findViewById(R.id.textOverview_2);
        ratingBar = findViewById(R.id.ratingBar);

        Movie movie = Parcels.unwrap(getIntent().getParcelableExtra("movie"));
        tvTitle_2.setText(movie.getTitle());
        tvOverview.setText(movie.getOverview());
        ratingBar.setRating((float) movie.getRating());

    }
}