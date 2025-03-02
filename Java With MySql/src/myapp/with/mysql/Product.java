package myapp.with.mysql;

public class Product {

    private int id;
    private String name;
    private float price;
    private String addDate;
    private byte[] picture;

    public Product(int pId, String pName, float pPrice, String pAddDate, byte[] pImg) {
        this.id = pId;
        this.name = pName;
        this.price = pPrice;
        this.addDate = pAddDate;
        this.picture = pImg;
    }

    //    getter method
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public float getPrice(){
        return price;
    }
    public String getAddDate(){
        return addDate;
    }
    public byte[] getImg(){
        return picture;
    }
    
    // Setter method
    
}
