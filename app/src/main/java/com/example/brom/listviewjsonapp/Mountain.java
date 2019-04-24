package com.example.brom.listviewjsonapp;

public class Mountain {
    private String name;
    private String location;
    private int height;


    public Mountain(String inName, String inLocation, int inHeight) {
        name = inName;
        location = inLocation;
        height = inHeight;
    }

    public Mountain(String inName) {
        name = inName;
        location = "";
        height = -1;
    }

    public String toString() {
        return name;
    }

    public String info() {
        String str = name;
        str += "Ligger i ";
        str += location;
        str += "och har höjden ";

        str += Integer.toString(height);
        return str;
    }

    public void setHeight (int newHeight){
         this.height = newHeight;
    }
    public String getHeight() {
    String hojd=String.valueOf(height);
    return hojd;
    }
}
