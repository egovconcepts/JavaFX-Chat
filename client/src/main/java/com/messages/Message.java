package com.messages;

import java.io.Serializable;
import java.util.HashSet;

/**
 * Created by Dominic on 06-Mar-16.
 */
public class Message implements Serializable {

    private String name;
    private String type;
    private String msg;
    private HashSet userlist = new HashSet<String>();

    public Message() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {

        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public HashSet getUserlist() {
        return userlist;
    }

    public String getUserlistAsString(){
        return userlist.toString();
    }

    public void setUserlist(HashSet userlist2) {
        userlist = userlist2;
    }


}