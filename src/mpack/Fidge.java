package mpack;

public class Fidge extends Product{

    int liter;
    boolean freezer;

    public Fidge(String name, String description, double price, int liter, boolean freezer) {
        super(name, description, price);
        this.liter = liter;
        this.freezer = freezer;
    }

    public int getLiter() {
        return liter;
    }
    public boolean isFrezeer(){
        return freezer;
    }

}
