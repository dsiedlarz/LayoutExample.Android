package edu.dsiedlarz.layoutexamples;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ListView listView = findViewById(R.id.listView);

        ArrayList<String> items = new ArrayList<>();
        for(int i =0 ;i <100; i++) {
            items.add("Go to Navigation Drawer activity");
        }


        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.row, items);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(), NavigationDrawerActivity.class);
                startActivity(intent);
            }
        });
    }
}
