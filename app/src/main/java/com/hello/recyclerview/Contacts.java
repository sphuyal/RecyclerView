package com.hello.recyclerview;

public class Contacts {
    private  String name;
    private String phoneNO;
    private int imageid;

    public Contacts(String name, String phoneNO, int imageid) {
        this.name = name;
        this.phoneNO = phoneNO;
        this.imageid = imageid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNO() {
        return phoneNO;
    }

    public void setPhoneNO(String phoneNO) {
        this.phoneNO = phoneNO;
    }

    public int getImageid() {
        return imageid;
    }

    public void setImageid(int imageid) {
        this.imageid = imageid;
    }
}
