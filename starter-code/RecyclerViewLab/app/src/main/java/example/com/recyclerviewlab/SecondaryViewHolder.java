package example.com.recyclerviewlab;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Jonathan Taylor on 7/5/16.
 */
public class SecondaryViewHolder extends RecyclerView.ViewHolder {

    View mColorView;
    TextView mTitleView;
    TextView mDescriptionView;
    CheckBox mCheckBox;
    RelativeLayout mLayout;

    public SecondaryViewHolder(View itemView) {
        super(itemView);

        mColorView = itemView.findViewById(R.id.colorbox_secondary);
        mTitleView = (TextView) itemView.findViewById(R.id.title_secondary);
        mDescriptionView = (TextView) itemView.findViewById(R.id.description_secondary);
        mCheckBox = (CheckBox) itemView.findViewById(R.id.checkbox);
        mLayout = (RelativeLayout) itemView.findViewById(R.id.innerlayoutsecondary);
    }

    public void setColor(int color){
        mColorView.setBackgroundColor(color);
    }

    public void setTitleView(String title){
        mTitleView.setText(title);
    }

    public void setDescription(String description){
        mDescriptionView.setText(description);
    }

    public void setCheckBox(boolean check){
        mCheckBox.setChecked(check);
    }

    public void setCheckBoxListener(View.OnClickListener listener){
        mCheckBox.setOnClickListener(listener);
    }

    public void setRowOnClickListener(View.OnClickListener listener){
        mLayout.setOnClickListener(listener);
    }

    public Context getContext(){
        return mColorView.getContext();
    }
}
