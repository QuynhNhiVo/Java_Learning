package learn._7Abstraction;

public class SinhVienIT extends SinhVien {
    private String language;

    public SinhVienIT(String id, String name, double price, double tax, String language) {
        super(id, name, price, tax);
        this.language = language;
    }

    public void getMoney(){
        System.out.println("Get money IT");
        super.info();
    }

    @Override
    void tinhDiem() {

    }

    public void info(){
        System.out.println("Sinh vien IT");
    }

    public static void main(String[] args) {
        SinhVienIT sinhVienIT = new SinhVienIT("11", "New", 153, 0.2, "java");
        System.out.println(sinhVienIT.id);
    }
}
