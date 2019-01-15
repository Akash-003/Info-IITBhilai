package com.iitbhilai.idp.infoiitbhilai;

/**
 * Created by Naman M Samarth on 24-01-2017.
 */

public class DevWord {

    private int mImageResourceId;

    private String mName;

    private String mRollNo;

    public DevWord (int imageResourceId, String name, String rollNo) {

        mImageResourceId = imageResourceId;
        mName = name;
        mRollNo = rollNo;
    }

    public int getImageResourceId () {

        return mImageResourceId;
    }

    public String getRollNo () {

        return mRollNo;
    }

    public String getName () {

        return mName;
    }
}
