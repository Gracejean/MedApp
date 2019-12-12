package View;


public class Botica1 {

    private int id;
    private String brandname;
    private String genericname;
    private String description;
    private int price;
    private int quantity;

    public Botica1(int id, String brandname, String genericname, String description, int price, int quantity) {
        this.id = id;
        this.brandname = brandname;
        this.genericname = genericname;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    Botica1() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }

    public String getGenericname() {
        return genericname;
    }

    public void setGenericname(String genericname) {
        this.genericname = genericname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public class AllergyMedicine1 extends Botica1 {

        public AllergyMedicine1(int id, String brandname, String genericname, String description, int price, int quantity) {
            super(id, brandname, genericname, description, price, quantity);
        }
    }

    public class HeadacheMedicine1 extends Botica1 {

        public HeadacheMedicine1(int id, String brandname, String genericname, String description, int price, int quantity) {
            super(id, brandname, genericname, description, price, quantity);
        }
    }

    public class CoughMedicine1 extends Botica1 {

        public CoughMedicine1(int id, String brandname, String genericname, String description, int price, int quantity) {
            super(id, brandname, genericname, description, price, quantity);
        }
    }
    
    public class BodypainMedicine extends Botica1 {

        public BodypainMedicine(int id, String brandname, String genericname, String description, int price, int quantity) {
            super(id, brandname, genericname, description, price, quantity);
        }
    }

}