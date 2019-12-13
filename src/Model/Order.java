package Model;


public class Order {

    private int id;
    private String brandname;
    private int quantity;
    private int price;
    private int total;

    public Order(int id, String brandname, int price, int quantity, int total) {
        this.id = id;
        this.brandname = brandname;
        this.price = price;
        this.quantity = quantity;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuan(int quantity) {
        this.quantity = quantity;
    }

}
