package example.com.recyclerviewlab;

/**
 * Created by Jonathan Taylor on 7/5/16.
 */
public class MainObject {
    private String mTitle;
    private String mDescription;
    private int mColor;

    public MainObject(String title, String description, int color) {
        mTitle = title;
        mDescription = description;
        mColor = color;
    }

    public MainObject() {
        mTitle = "Default Title";
        mDescription = "This is a default description for this object.";
        mColor = R.color.green;
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
}
