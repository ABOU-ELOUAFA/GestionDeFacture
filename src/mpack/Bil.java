package mpack;

import java.util.HashMap;
import java.util.Map;

public class Bil {
   private Client customer;
   private Map<Product,Integer> products=new HashMap<Product,Integer>();
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
    public double getTotal(){
        double total=delivery.getPrice();
        for (Product i:products.keySet()) {
            total=total+(i.getPrice())*(products.get(i));
        }
        return total;
    }

    public void generate(Writer write){
        write.start();
        write.writLine("HomeShop compagnie");
        write.writLine("1 Place Charles de Gaulle, 75008 Paris");
        write.writLine("");
        write.writLine("Facture à l'attention de :");
        write.writLine(customer.getName());
        write.writLine(customer.getAdresse());
        write.writLine("");
        write.writLine("Mode de livraison : livraison point relais");
        write.writLine("");
        write.writLine("Produits :");
        write.writLine("------------------------------------------------------------------------");
       for (Product i:products.keySet()){
           write.writLine(i.getName()+"-"+i.getPrice()+ "-"+ products.get(i)+"unites");
           write.writLine(i.getDescription());
       }
       write.writLine("Livraison"+delivery.getPrice());
       write.writLine("-------------------------------------------------------------------------");
       write.writLine("Total :" +getTotal());
       write.stop();

    }

}
