package learn._7Abstraction;

public class SinhVienCoKhi extends SinhVien {
    private String skill;

    public SinhVienCoKhi(String id, String name, double price, double tax, String skill) {
        super(id, name, price, tax);
        this.skill = skill;
    }

    public static void main(String[] args) {
        SinhVienCoKhi sinhVienCoKhi = new SinhVienCoKhi("11", "New", 153, 0.2, "machine");
        System.out.println(sinhVienCoKhi.price);
    }

    @Override
    void tinhDiem() {

    }
}
