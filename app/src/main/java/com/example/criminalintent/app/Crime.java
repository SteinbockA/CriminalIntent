package com.example.criminalintent.app;

import java.util.UUID;

/**
 * Created by Aaron on 2015/5/18.
 */
public class Crime {
    private UUID mID;
    private String mTitle;

    public Crime(){
        mID=UUID.randomUUID();
    }

    public UUID getmID() {
        return mID;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }
}
