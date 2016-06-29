package com.diewland.twitterarchive.model;

public class Tweet {

    private int id;
    private String tw_text;
    private int rt_count;
    private int fav_count;
    private String created_at;

    public Tweet(int id, String tw_text, int rt_count, int fav_count, String created_at) {
        this.id = id;
        this.tw_text = tw_text;
        this.rt_count = rt_count;
        this.fav_count = fav_count;
        this.created_at = created_at;
    }

    public int getId() { return id; }

    public String getTwText() {
        return tw_text;
    }

    public int getRt_count() {
        return rt_count;
    }

    public int getFav_count() {
        return fav_count;
    }

    public String getCreated_at() {
        return created_at;
    }
}
