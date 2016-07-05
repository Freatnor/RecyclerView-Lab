package example.com.recyclerviewlab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SecondaryActivity extends AppCompatActivity {

    private List<SecondaryObject> mObjects;
    private LinearLayoutManager mLayoutManager;
    private SecondaryAdapter mAdapter;
    private RecyclerView mView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        mObjects = new ArrayList<>();
        mObjects.add(new SecondaryObject());
        mObjects.add(new SecondaryObject("Some Title", "Some Description", R.color.black));
        mObjects.add(new SecondaryObject("Some Other Title", "Some Other Description", R.color.colorAccent));
        for (int i = 0; i < 10; i++) {
            mObjects.add(new SecondaryObject());
        }

        mView = (RecyclerView) findViewById(R.id.recyclerviewsecond);
        mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mView.setLayoutManager(mLayoutManager);

        mAdapter = new SecondaryAdapter(mObjects);
        mView.setAdapter(mAdapter);


    }
}
