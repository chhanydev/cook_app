package com.uiresource.cookit.model;

import java.io.Serializable;

/**
 * Created by User on 5/30/2017.
 */

public class Food{


    private String  avatar;
    private String component;
    private String howtodo;
    private String title;

    public Food(String title, String avatar, String component, String howtodo) {
        this.title = title;
        this.avatar = avatar;
        this.component = component;
        this.howtodo = howtodo;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getHowtodo() {
        return howtodo;
    }

    public void setHowtodo(String howtodo) {
        this.howtodo = howtodo;
    }


}
