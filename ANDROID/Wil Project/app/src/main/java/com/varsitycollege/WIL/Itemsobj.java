package com.varsitycollege.WIL;
class Itemsobj {
    private static String imagePath;
    private static String name;
    Itemsobj(String name, String imagePath) {
        this.imagePath = imagePath;
        this.name = name;
    }
    static String getImagePath() {
        return imagePath;
    }
    static String getName() {
        return name;
    }
}