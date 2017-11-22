package edu.dsiedlarz.layoutexamples;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class RelativeLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relactive_layout);
    }

    public void goToConstraintLayout(View view) {
        Intent intent = new Intent(this, ConstraintLayoutActivity.class);
        startActivity(intent);
    }
}
