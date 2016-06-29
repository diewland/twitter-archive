package com.diewland.twitterarchive.helper;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.diewland.twitterarchive.R;
import com.diewland.twitterarchive.model.Tweet;

import java.util.ArrayList;

public class TweetAdapter extends BaseAdapter {

    private Activity activity;
    private ArrayList<Tweet> data;
    private static LayoutInflater inflater=null;

    public TweetAdapter(Activity a, ArrayList<Tweet> d) {
        activity = a;
        data=d;
        inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public int getCount() {
        return data.size();
    }

    public Object getItem(int position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View vi=convertView;
        if(convertView==null){
            vi = inflater.inflate(R.layout.tweet, null);
        }

        TextView tw_text   = (TextView)vi.findViewById(R.id.tw_text);
        TextView rt_count  = (TextView)vi.findViewById(R.id.rt_count);
        TextView fav_count = (TextView)vi.findViewById(R.id.fav_count);
        TextView created_at = (TextView)vi.findViewById(R.id.created_at);

        Tweet tw = data.get(position);

        // Setting all values in listview
        tw_text.setText(tw.getTwText());
        rt_count.setText("RT: " + tw.getRt_count());
        fav_count.setText("FAV: " + tw.getFav_count());
        created_at.setText(tw.getCreated_at());
        return vi;
    }

}
