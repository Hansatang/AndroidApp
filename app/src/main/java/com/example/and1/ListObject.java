package com.example.and1;

public class ListObject {

    private String mName;
    private int mIconId;

    ListObject(String name, int iconId) {
        mName = name;
        mIconId = iconId;
    }

    public String getName() {
        return mName;
    }

    public int getIconId() {
        return mIconId;
    }

}
