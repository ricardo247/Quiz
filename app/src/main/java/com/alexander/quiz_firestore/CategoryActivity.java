package com.alexander.quiz_firestore;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.MenuItem;
import android.widget.GridView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import static com.alexander.quiz_firestore.SplashActivity.catList;

public class CategoryActivity extends AppCompatActivity {

    private GridView catGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        getSupportActionBar().setTitle("Categories");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        catGrid = findViewById(R.id.catGridview);

        CatGridAdapter adapter = new CatGridAdapter(catList);
        catGrid.setAdapter(adapter);


    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == android.R.id.home)
        {
            CategoryActivity.this.finish();
        }

        return super.onOptionsItemSelected(item);
    }

}
