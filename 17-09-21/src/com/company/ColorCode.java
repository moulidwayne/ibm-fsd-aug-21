package com.company;

public enum ColorCode {

    R("Red"),
    G("Green"),
    B("Blue");

    private String colorName;

   private ColorCode(String colorName) {
        this.colorName = colorName;
    }

    public String getColorName() {
        return colorName;
    }
}
