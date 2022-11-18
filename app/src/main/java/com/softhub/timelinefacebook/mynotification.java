package com.softhub.timelinefacebook;

public class mynotification {
    String prfile;
    String msg;
    String time;

    public mynotification(String prfile, String msg, String time) {
        this.prfile = prfile;
        this.msg = msg;
        this.time = time;
    }

    public String getPrfile() {
        return prfile;
    }

    public void setPrfile(String prfile) {
        this.prfile = prfile;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
