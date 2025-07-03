package Level1.model;

import Level1.exception.VoidSaleException;

import java.util.ArrayList;

public class Sale {
    private ArrayList<Product> products = null;
    private double totalPrice;

    public Sale() {
        this.products = new ArrayList<>();
        totalPrice = 0;
    }

    public void calculateTotal() throws VoidSaleException {
        if (this.products.isEmpty())
            throw new VoidSaleException("For do a sale, first you need to add products.");
        for (Product p : products)
            this.totalPrice += p.getPrice();
        System.out.println("The total price is " +  this.totalPrice);
    }

    public ArrayList<Product> getProducts() {return products;}
}
