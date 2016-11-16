package com.example.android.kathmandu;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by tyrone3 on 14.11.16.
 */
public class Attraction implements Parcelable {

    private String mTitle;
    private String mPreviewText;
    private String mMainText;
    private int mImageResourceId;


    public Attraction(String title, String previewText, String mainText, int imageResourceId) {
        mTitle = title;
        mPreviewText = previewText;
        mMainText = mainText;
        mImageResourceId = imageResourceId;
    }

    public String getTitle() {return mTitle;}
    public String getPreviewText() {return mPreviewText;}
    public String getMainText() {return mMainText;}
    public int getImageResourceId() {return mImageResourceId;}

    protected Attraction(Parcel in) {
        mTitle = in.readString();
        mPreviewText = in.readString();
        mMainText = in.readString();
        mImageResourceId = in.readInt();
    }

    public static final Creator<Attraction> CREATOR = new Creator<Attraction>() {
        @Override
        public Attraction createFromParcel(Parcel in) {
            return new Attraction(in);
        }

        @Override
        public Attraction[] newArray(int size) {
            return new Attraction[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mTitle);
        parcel.writeString(mPreviewText);
        parcel.writeString(mMainText);
        parcel.writeInt(mImageResourceId);
    }
}
