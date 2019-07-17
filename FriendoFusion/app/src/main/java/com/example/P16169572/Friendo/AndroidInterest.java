package com.example.P16169572.Friendo;

public class AndroidInterest {

    // Name of Interest (e.g. Gym, Yoga, Football)
    private String mInterestName;

    // Email of users who chose the interest
    private String mUserEmail;

    // Drawable resource ID
    private int mImageResourceId;

    /*
     * Create a new AndroidInterest object.
     *@param
     * @param vInterest is the name of the Interest (e.g. Football)
     * @param vUser is the corresponding user who chose the Interest
     * @param image is drawable reference ID that corresponds to the Interest
     * */
    public AndroidInterest(String vInterest, String vUser, int imageResourceId)
    {
        mInterestName = vInterest;
        mUserEmail = vUser;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the name of the Interest
     */
    public String getInterestName() {
        return mInterestName;
    }

    /**
     * Get the User Email
     */
    public String getUserEmail() {
        return mUserEmail;
    }

    /**
     * Get the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }


}
