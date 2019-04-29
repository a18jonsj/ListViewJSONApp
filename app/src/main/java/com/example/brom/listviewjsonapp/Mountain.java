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
        str += "\nLigger i ";
        str += location;
        str += "\noch har höjden ";

        str += Integer.toString(height);
        str += " meter";
        return str;
    }

    public void setHeight (int newHeight){
         this.height = newHeight;
    }
    public String getHeight() {
    String hojd=String.valueOf(height);
    return hojd;
    }

    public void setLocation (String newLocation) {
        this.location = newLocation;

    }
    public String getLocation () {
        String newLocation = location;
        return newLocation;
    }
}
