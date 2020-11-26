package com.example.ratingbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindLayoutView();
        addOnRatingBarChangeListener();
    }

    public void bindLayoutView() {
        ratingBar = (RatingBar) findViewById(R.id.ratingBar);
    }

    public void addOnRatingBarChangeListener() {
        ratingBar.setOnRatingBarChangeListener(new onRatingBarChangeListener());

        ratingBar.setMax(4);
    }

    private class onRatingBarChangeListener implements RatingBar.OnRatingBarChangeListener {
        @Override
        public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

        }
    }
}