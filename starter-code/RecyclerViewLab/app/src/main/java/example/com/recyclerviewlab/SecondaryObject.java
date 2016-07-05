package example.com.recyclerviewlab;

/**
 * Created by Jonathan Taylor on 7/5/16.
 */
public class SecondaryObject {
    private String mTitle;
    private String mDescription;
    private int mColor;
    private boolean mChecked;

    public SecondaryObject(String title, String description, int color) {
        mTitle = title;
        mDescription = description;
        mColor = color;
        mChecked = false;
    }

    public SecondaryObject() {
        mTitle = "Default Title";
        mDescription = "This is a default description for this object.";
        mColor = R.color.green;
        mChecked = false;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getDescription() {
        return mDescription;
    }

    public int getColor() {
        return mColor;
    }

    public boolean isChecked() {
        return mChecked;
    }

    public void setChecked(boolean checked) {
        mChecked = checked;
    }
}