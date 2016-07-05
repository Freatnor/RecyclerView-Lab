package example.com.recyclerviewlab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<MainObject> mObjects;
    private LinearLayoutManager mLayoutManager;
    private MainAdapter mAdapter;
    private RecyclerView mView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mObjects = new ArrayList<>();
        mObjects.add(new MainObject());
        mObjects.add(new MainObject("Some Title", "Some Description", R.color.black));
        mObjects.add(new MainObject("Some Other Title", "Some Other Description", R.color.colorAccent));
        for (int i = 0; i < 10; i++) {
            mObjects.add(new MainObject());
        }

        mView = (RecyclerView) findViewById(R.id.recyclerview);
        mLayoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);


        Log.d("adapter object list",mObjects.toString());
        mAdapter = new MainAdapter(mObjects);
        mView.setAdapter(mAdapter);

        mView.setLayoutManager(mLayoutManager);


    }
}