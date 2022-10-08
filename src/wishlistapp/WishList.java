/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wishlistapp;

import java.io.Serializable;

/**
 *
 * @author jadef
 */
public abstract class WishList implements Serializable{
    protected int number;
    protected String description;
    protected double price;
    protected String url;

    public WishList() {
        number = 0;
        description = "";
        price = 0.0;
        url = "";
    }

    public WishList(int number, String description, double price, String url) {
        this.number = number;
        this.description = description;
        this.price = price;
        this.url = url;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    public String getDetails(){
        return "Wish List Details \nNumber: "+number+"\nDescription: "+description+"\nPrice: "+price+"\nUrl: "+url;
    }
    
 
    
}
