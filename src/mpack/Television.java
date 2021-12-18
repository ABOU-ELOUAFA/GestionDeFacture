package mpack;

public class Television extends Product {
    int size;
    String slabTybe;

    public Television(String name, String description, double price, int size, String slabTybe) {
        super(name, description, price);
        this.size = size;
        this.slabTybe = slabTybe;
    }

    public int getSize() {
        return size;
    }

    public String getSlabTybe() {
        return slabTybe;
    }
}
