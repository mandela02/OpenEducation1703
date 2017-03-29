package com.example.brucewayne.facebook;

/**
 * Created by Bruce Wayne on 3/29/2017.
 */

public class Item {
    private int avatar;
    private String name;
    private String story;

    public Item(int avatar, String name) {
        this.avatar = avatar;
        this.name = name;
    }

    public Item(int avatar, String name, String story) {
        this.avatar = avatar;
        this.name = name;
        this.story = story;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }
}
