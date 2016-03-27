package com.well.swipe;

import android.content.Context;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by mingwei on 3/25/16.
 * 所有Tools数据
 */
public class AllToolsList {

    public ArrayList<ItemSwipeSwitch> mSwipeDataList;

    public String mSwipeActionArrAy[];

    public String mSwipeTitleArrAy[];

    public AllToolsList(Context context) {
        mSwipeDataList = new ArrayList<>();
        mSwipeActionArrAy = context.getResources().getStringArray(R.array.swipe_tools_action_array);
        mSwipeTitleArrAy = context.getResources().getStringArray(R.array.swipe_tools_title_array);
        for (int i = 0; i < mSwipeActionArrAy.length; i++) {
            ItemSwipeSwitch itemswitch = new ItemSwipeSwitch();
            itemswitch.mTitle = mSwipeTitleArrAy[i];
            itemswitch.mAction = mSwipeActionArrAy[i];
            //itemswitch.
            mSwipeDataList.add(itemswitch);
        }
    }

    public void printF() {
        for (int i = 0; i < mSwipeDataList.size(); i++) {
            Log.i("Gmw", "title=" + mSwipeDataList.get(i).mTitle);
        }
    }

}