package mpack;

import java.util.HashMap;
import java.util.Map;

public class Bil {
   private Client customer;
   private Map<Product,Integer> products=new HashMap<>();
   private Delivery delivery;

    public Bil(Client customer, Delivery delivery) {
        this.customer = customer;
        this.delivery = delivery;
    }

    public void addProduct(Product produit, Integer quantity){
        this.products.put(produit,quantity);

    }

    public Client getCustomer() {
        return customer;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

}
