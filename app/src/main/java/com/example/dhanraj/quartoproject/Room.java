package com.example.dhanraj.quartoproject;


public class Room {

    private String Title;
    private String Category;
    private String Description;
    private String Address;
    private String PhoneTitle;
    private String PhoneNumber;
    private String Features;
    private String Feafea;
    private int Thumbnail;


    public Room(String title, String category, String description, String address,String phoneTitle,String phoneNumber,String features,String feafea,int thumbnail) {
        Title = title;
        Category = category;
        Description = description;
        Address = address;
        PhoneTitle = phoneTitle;
        PhoneNumber = phoneNumber;
        Features = features;
        Feafea = feafea;
        Thumbnail = thumbnail;
    }


    public String getTitle() {
        return Title;
    }

    public String getCategory() {
        return Category;
    }

    public String getDescription() {
        return Description;
    }

    public String getPhoneTitle() {
        return PhoneTitle;
    }
    public String getPhoneNumber() {
        return PhoneNumber;
    }
    public String getAddress() {
        return Address;
    }

    public String getFeatures() {
        return Features;
    }
    public String getFeafea() {
        return Feafea;
    }

    public int getThumbnail() {
        return Thumbnail;
    }


    public void setTitle(String title) {
        Title = title;
    }

    public void setCategory(String Decent_Quality_Room) {
        Category = Decent_Quality_Room;
    }

    public void setAddress(String address) {
        Address = address;
    }
    public void setPhoneTitle(String phoneTitle) {
        PhoneTitle = phoneTitle;
    }
    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
    public String setFeatures() {
        return Features;
    }
    public String setFeafea() {
        return Feafea;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}

