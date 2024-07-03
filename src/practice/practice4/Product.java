package practice.practice4;

public class Product {
    private String name;
    private double price;
    private double tax;

    public Product(String name, double price, double tax){
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    public Product() {
    }

    public Product nhapThongTin(String name, double price, double tax){
        Product product = new Product(name, price, tax);
        return product;
    }

    public void xuatThongTin(Product product){
        System.out.println("Name = " + product.getName() + ", Price = " + product.getPrice() + ", Tax = " + product.getTax() );
    }

    public double getTaxPrice(double price, double tax){
        System.out.print("Tax = " );
        return price*tax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public static void main(String[] args) {

    }
}
