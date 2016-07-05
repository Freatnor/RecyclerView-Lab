package example.com.recyclerviewlab;

import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Jonathan Taylor on 7/5/16.
 */
public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> {

    private List<MainObject> mObjects;

    public MainAdapter(List<MainObject> objects) {
        mObjects = objects;
    }

    @Override
    public MainViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View parentView = LayoutInflater.from(parent.getContext()).inflate(R.layout.inner_recycler_layout_main, parent, false);
        return new MainViewHolder(parentView);
    }

    @Override
    public void onBindViewHolder(MainViewHolder holder, int position) {
        final MainObject object = mObjects.get(position);
        holder.setColor(ContextCompat.getColor(holder.getContext(), object.getColor()));
        holder.setTitleView(object.getTitle());
        holder.setDescription(object.getDescription());

        holder.setRowOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String toastString = "You tapped " + object.getTitle();
                Toast.makeText(view.getContext(), toastString, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mObjects.size();
    }
}
