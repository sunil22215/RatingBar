package com.example.ratingbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private RatingBar ratingBar;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindLayoutView();
        addListenerOnButtonClick();
    }

    public void bindLayoutView() {
        ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        button = (Button) findViewById(R.id.button);
    }

    public void addListenerOnButtonClick() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rating = String.valueOf(ratingBar.getRating());
                Toast.makeText(getApplicationContext(), rating, Toast.LENGTH_SHORT).show();
            }
        });
        ratingBar.setMax(4);
    }
}