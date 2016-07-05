package example.com.recyclerviewlab;

import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.R.color;

import java.util.List;

/**
 * Created by Jonathan Taylor on 7/5/16.
 */
public class SecondaryAdapter extends RecyclerView.Adapter<SecondaryViewHolder> {

    private List<SecondaryObject> mObjects;

    public SecondaryAdapter(List<SecondaryObject> objects) {
        mObjects = objects;
    }

    @Override
    public SecondaryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View parentView = LayoutInflater.from(parent.getContext()).inflate(R.layout.inner_recycler_layout_secondary, parent, false);
        return new SecondaryViewHolder(parentView);
    }

    @Override
    public void onBindViewHolder(SecondaryViewHolder holder, int position) {
        final SecondaryObject object = mObjects.get(position);
        final SecondaryViewHolder myHolder = holder;
        myHolder.setColor(ContextCompat.getColor(holder.getContext(), object.getColor()));
        myHolder.setTitleView(object.getTitle());
        myHolder.setDescription(object.getDescription());

        myHolder.setCheckBox(object.isChecked());

        holder.setCheckBoxListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean checked = ((CheckBox) view).isChecked();
                object.setChecked(checked);
            }
        });
        holder.setRowOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean checked = object.isChecked();
                object.setChecked(!checked);
                myHolder.setCheckBox(!checked);
                Toast.makeText(view.getContext(), "Changed the checkBox?", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mObjects.size();
    }
}