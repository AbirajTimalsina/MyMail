package com.abiraj.mymail;

public class Mails {

    private String name;
    private String title;
    private String desc;
    private int imageID;
    private String time;


    public Mails(String name,String title,String desc,String time,int imageID){

        this.name = name;
        this.title = title;
        this.desc = desc;
        this.time = time;
        this.imageID = imageID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }


}
