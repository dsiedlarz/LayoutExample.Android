package edu.dsiedlarz.layoutexamples;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GridLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);
    }

    public void goToLinearLayout(View view) {
        Intent intent = new Intent(this, LinearLayoutActivity.class);
        startActivity(intent);
    }
}
