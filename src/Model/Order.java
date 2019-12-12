package Model;


public class Order {
    private int quan;
    private int price;
    private int total;

    public Order(int quan, int price, int total) {
        this.quan = quan;
        this.price = price;
        this.total = total;
    }

    public int getQuan() {
        return quan;
    }

    public void setQuan(int quan) {
        this.quan = quan;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    
    
}
