package main.java.mpack;

public class ExpressDelivery implements Delivery {
    private String ville;

    public ExpressDelivery(String ville) {
        this.ville = ville;
    }

    @Override
    public double getPrice() {
        if (this.ville=="Paris"){
            return 6.99;
        } else return 9.99;
    }

}
