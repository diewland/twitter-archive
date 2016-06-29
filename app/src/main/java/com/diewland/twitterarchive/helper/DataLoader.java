package com.diewland.twitterarchive.helper;

import com.diewland.twitterarchive.model.Tweet;

import java.util.ArrayList;

public class DataLoader {

    public static ArrayList<Tweet> load(){
        ArrayList<Tweet> data = new ArrayList<Tweet>();

        // TODO test only
        for(int i=1; i<=20; i++) {
            data.add(new Tweet(i, "Hello Twitter! #" + i, 0, 0, "2016-01-01 09:00:00"));
        }

        // TODO *** add some stuff here ***

        return data;
    }

}
