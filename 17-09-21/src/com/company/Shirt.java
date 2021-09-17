package com.company;

public class Shirt {

    private int shirtId;
    private double price;
    private ColorCode colorCode;

    public Shirt(int shirtId, double price, ColorCode colorCode) {
        this.shirtId = shirtId;
        this.price = price;
        this.colorCode = colorCode;
    }
    public String getDetails()
    {
        return "Shirt Id: "+shirtId+" Price: "+price+" Color Code: "+colorCode.getColorName();

    }

}
