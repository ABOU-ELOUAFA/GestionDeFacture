package mpack;

public class Product {
    private String name;
    private String description;
    private double price;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void look(){
        System.out.println(String.format(name+":"+price+"%n"+description));

    }
    public void buy(Bil bil,Integer qte){


    }


}
