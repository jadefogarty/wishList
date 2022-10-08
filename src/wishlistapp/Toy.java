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
public class Toy extends WishList {
    private String name;
    private String type;

    public Toy() {
        super();
        name = "";
        type = "";
    }

    public Toy(String name, String type, int number, String description, double price, String url) {
        super(number, description, price, url);
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    @Override
    public String getDetails(){
        return super.getDetails()+"\nName: "+name+"\nType: "+type;
    }
    
    
}
