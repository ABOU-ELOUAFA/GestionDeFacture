package mpack;

import java.util.Map;

public class Bil {
   private Client customer;
    private Map<Product,Integer> products;

    public void addProduct(Product produit,Integer quantity){
        this.products.put(produit,quantity);

    }

    public Client getCustomer() {
        return customer;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public Bil(Client customer) {
        this.customer = customer;
    }
}
