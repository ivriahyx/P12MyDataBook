package com.myapplicationdev.android.p12_mydatabook;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class NewActivity extends AppCompatActivity {

    ActionBar ab;
    ImageView ivLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        ivLogo = (ImageView)findViewById(R.id.imageViewLogo);
        String imageurl = "https://upload.wikimedia.org/wikipedia/commons/8/80/Republic_Polytechnic_Logo.jpg";

        Picasso.get().load(imageurl)
                .placeholder(R.drawable.loading)
                .error(R.drawable.error)
                .into(ivLogo);

    }
}
