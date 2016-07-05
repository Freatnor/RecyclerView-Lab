package example.com.recyclerviewlab;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Jonathan Taylor on 7/5/16.
 */
public class MainViewHolder extends RecyclerView.ViewHolder {

    View mColorView;
    TextView mTitleView;
    TextView mDescriptionView;
    LinearLayout mLayout;

    public MainViewHolder(View itemView) {
        super(itemView);

        mColorView = itemView.findViewById(R.id.colorbox);
        mTitleView = (TextView) itemView.findViewById(R.id.title);
        mDescriptionView = (TextView) itemView.findViewById(R.id.description);
        mLayout = (LinearLayout) itemView.findViewById(R.id.innerlayout);
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

    public void setRowOnClickListener(View.OnClickListener listener){
        mLayout.setOnClickListener(listener);
    }

    public Context getContext(){
        return mColorView.getContext();
    }
}
