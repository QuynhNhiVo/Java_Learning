package practice.practice4;

public class Product1 {
    public static void main(String[] args) {
        Product product = new Product();
        Product test = product.nhapThongTin("PC", 100, 3);
        product.xuatThongTin(test);
        System.out.println(product.getTaxPrice(test.getPrice(), test.getTax()));
    }
}
