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
public class Voucher extends WishList {
    private String store;
    private String yearOfExp;

    public Voucher() {
        super();
        store = "";
        yearOfExp = "";
    }

    public Voucher(String store, String yearOfExp, int number, String description, double price, String url) {
        super(number, description, price, url);
        this.store = store;
        this.yearOfExp = yearOfExp;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getYearOfExp() {
        return yearOfExp;
    }

    public void setYearOfExp(String yearOfExp) {
        this.yearOfExp = yearOfExp;
    }
    
    @Override
    public String getDetails(){
        return super.getDetails()+"\nStore: "+store+"\nYear Of Expiry: "+yearOfExp;
    }
    
    
    
}
