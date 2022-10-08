/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wishlistapp;

/**
 *
 * @author jadef
 */
public class CraftSupplies extends WishList {
    private String type;
    private String brand;
    private String colour;

    public CraftSupplies() {
        super();
        type = "";
        brand = "";
        colour = "";
    }

    public CraftSupplies(String type, String brand, String colour, int number, String description, double price, String url) {
        super(number, description, price, url);
        this.type = type;
        this.brand = brand;
        this.colour = colour;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    
    @Override
    public String getDetails(){
        return super.getDetails()+"\nType: "+type+"\nBrand: "+brand+"\nColour: "+colour;
    }
    
    
}
