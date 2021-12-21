package mpack;

public class RelayDelivery implements Delivery {
    private int num;

    public int getNum() {
        return num;
    }

    public RelayDelivery(int num) {
        this.num = num;
    }

    @Override
    public double getPrice() {
        if (this.num>=1 && this.num<=22){
            return 0;
        }else if (this.num>=23 && this.num<=47) {
            return 2.99;
        } else return 4.99;
        }

    }


