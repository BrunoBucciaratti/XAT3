package com.example.xat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class PagesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pages);

        //LinearLayout typesBg = findViewById(R.id.pagesBg);
        ImageView typesImage = findViewById(R.id.pagesImage);
        TextView typesTitle = findViewById(R.id.pagesTitle);

        //typesBg.setBackgroundColor(getIntent().getIntExtra("typesBg", 0));
        typesImage.setImageResource(getIntent().getIntExtra("typesImage", 0));
        typesTitle.setText(getIntent().getStringExtra("typesTitle"));
    }
}