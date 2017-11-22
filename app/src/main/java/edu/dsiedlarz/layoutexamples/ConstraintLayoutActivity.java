package edu.dsiedlarz.layoutexamples;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ConstraintLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint_layout);
    }

    public void goToGridLayout(View view) {
        Intent intent = new Intent(this, GridLayoutActivity.class);
        startActivity(intent);
    }
}
